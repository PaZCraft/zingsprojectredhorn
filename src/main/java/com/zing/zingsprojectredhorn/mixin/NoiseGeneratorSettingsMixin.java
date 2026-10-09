package net.mcreator.zingsprojectredhorn.mixin;

import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.core.Holder;

import net.mcreator.zingsprojectredhorn.init.ZingsProjectRedHornModBiomes;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;

@Mixin(NoiseGeneratorSettings.class)
public class NoiseGeneratorSettingsMixin implements ZingsProjectRedHornModBiomes.ZingsProjectRedHornModNoiseGeneratorSettings {
	@Unique
	private Holder<DimensionType> zings_project_red_horn_dimensionTypeReference;

	@WrapMethod(method = "surfaceRule")
	public SurfaceRules.RuleSource surfaceRule(Operation<SurfaceRules.RuleSource> original) {
		SurfaceRules.RuleSource retval = original.call();
		if (this.zings_project_red_horn_dimensionTypeReference != null) {
			retval = ZingsProjectRedHornModBiomes.adaptSurfaceRule(retval, this.zings_project_red_horn_dimensionTypeReference);
		}
		return retval;
	}

	@Override
	public void setzings_project_red_hornDimensionTypeReference(Holder<DimensionType> dimensionType) {
		this.zings_project_red_horn_dimensionTypeReference = dimensionType;
	}
}