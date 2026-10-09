package com.zing.zingsprojectredhorn.mixin;

import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.level.biome.MultiNoiseBiomeSourceParameterList;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier; // Fixed: Changed from Identifier

import com.zing.zingsprojectredhorn.init.ZingsProjectRedHornModBiomes;

import java.lang.reflect.Proxy;
import java.util.function.Function;

@Mixin(MultiNoiseBiomeSourceParameterList.Preset.class)
public class BiomeSourcePresetMixin {

	// Since Preset is a Record, we intercept and daisy-chain the provider variable BEFORE it's assigned.
	// The nested SourceProvider type is not visible from this package, so we use reflection-based proxying
	// instead of directly referencing the inaccessible type.
	@ModifyVariable(method = "<init>(Lnet/minecraft/resources/Identifier;Lnet/minecraft/world/level/biome/MultiNoiseBiomeSourceParameterList$Preset$SourceProvider;)Lnet/minecraft/world/level/biome/MultiNoiseBiomeSourceParameterList$Preset$SourceProvider;", at = @At("HEAD"), argsOnly = true)
	private static Object daisyChainProvider(Object existingProvider, Identifier idArg) {
		if (!idArg.equals(ZingsProjectRedHornModBiomes.OVERWORLD_BIOMESOURCE_PRESET_ID)
				&& !idArg.equals(ZingsProjectRedHornModBiomes.NETHER_BIOMESOURCE_PRESET_ID)) {
			return existingProvider;
		}

		try {
			Class<?> sourceProviderClass = Class.forName(
					"net.minecraft.world.level.biome.MultiNoiseBiomeSourceParameterList$Preset$SourceProvider");

			return Proxy.newProxyInstance(
					sourceProviderClass.getClassLoader(),
					new Class<?>[] { sourceProviderClass },
					(proxy, method, args) -> {
						if (method.getName().equals("apply")) {
							Object originalList = method.invoke(existingProvider, args);
							return ZingsProjectRedHornModBiomes.adaptPresetParameterList(
									idArg,
									(Climate.ParameterList<?>) originalList,
									(Function<ResourceKey<Biome>, ?>) args[0]);
						}

						return method.invoke(existingProvider, args);
					});
		} catch (ReflectiveOperationException e) {
			throw new RuntimeException("Failed to wrap biome source preset provider for " + idArg, e);
		}
	}
}
