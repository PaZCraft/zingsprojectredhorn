/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.zingsprojectredhorn.init;

import net.neoforged.neoforge.event.server.ServerAboutToStartEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.levelgen.placement.CaveSurface;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.NoiseBasedChunkGenerator;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.dimension.BuiltinDimensionTypes;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder;

import java.util.function.Function;
import java.util.List;
import java.util.ArrayList;

import com.mojang.datafixers.util.Pair;

@EventBusSubscriber
public class ZingsProjectRedHornModBiomes {
	public static final Identifier OVERWORLD_BIOMESOURCE_PRESET_ID = Identifier.withDefaultNamespace("overworld");
	public static final Identifier NETHER_BIOMESOURCE_PRESET_ID = Identifier.withDefaultNamespace("nether");
	private static boolean BOOTSTRAP_VALIDATION_PASSED = false;

	@SubscribeEvent
	public static void onCommonSetup(FMLCommonSetupEvent event) {
		BOOTSTRAP_VALIDATION_PASSED = true;
	}

	@SubscribeEvent
	public static void onServerAboutToStart(ServerAboutToStartEvent event) {
		Registry<LevelStem> levelStemTypeRegistry = event.getServer().registryAccess().lookupOrThrow(Registries.LEVEL_STEM);
		for (LevelStem levelStem : levelStemTypeRegistry.stream().toList()) {
			Holder<DimensionType> dimensionType = levelStem.type();
			if (dimensionType.is(BuiltinDimensionTypes.NETHER) || dimensionType.is(BuiltinDimensionTypes.OVERWORLD)) {
				if (levelStem.generator() instanceof NoiseBasedChunkGenerator noiseGenerator) {
					((ZingsProjectRedHornModNoiseGeneratorSettings) (Object) noiseGenerator.generatorSettings().value()).setzings_project_red_hornDimensionTypeReference(dimensionType);
				}
			}
		}
	}

	public static SurfaceRules.RuleSource adaptSurfaceRule(SurfaceRules.RuleSource currentRuleSource, Holder<DimensionType> dimensionType) {
		if (dimensionType.is(BuiltinDimensionTypes.OVERWORLD))
			return injectOverworldSurfaceRules(currentRuleSource);
		return currentRuleSource;
	}

	public static <T> Climate.ParameterList<T> adaptPresetParameterList(Identifier idArg, Climate.ParameterList<T> originalList, Function<ResourceKey<Biome>, T> lookup) {
		if (!BOOTSTRAP_VALIDATION_PASSED)
			return originalList;
		if (idArg.equals(OVERWORLD_BIOMESOURCE_PRESET_ID))
			return ZingsProjectRedHornModBiomes.modifyOverworldParameterPoints(originalList, lookup);
		return originalList;
	}

	private static SurfaceRules.RuleSource injectOverworldSurfaceRules(SurfaceRules.RuleSource currentRuleSource) {
		List<SurfaceRules.RuleSource> customSurfaceRules = new ArrayList<>();
		customSurfaceRules.add(anySurfaceRule(ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath("zings_project_red_horn", "klaxon_caves")), Blocks.GRASS_BLOCK.defaultBlockState(), Blocks.DIRT.defaultBlockState(),
				Blocks.GRAVEL.defaultBlockState()));
		customSurfaceRules.add(preliminarySurfaceRule(ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath("zings_project_red_horn", "windy_snowy_taiga_plains")), Blocks.GRASS_BLOCK.defaultBlockState(),
				Blocks.DIRT.defaultBlockState(), Blocks.GRAVEL.defaultBlockState()));
		customSurfaceRules.add(preliminarySurfaceRule(ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath("zings_project_red_horn", "dried_flatlands")), Blocks.GRASS_BLOCK.defaultBlockState(), Blocks.DIRT.defaultBlockState(),
				Blocks.GRAVEL.defaultBlockState()));
		customSurfaceRules.add(preliminarySurfaceRule(ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath("zings_project_red_horn", "moratorium_beach")), Blocks.SAND.defaultBlockState(), Blocks.DIRT.defaultBlockState(),
				Blocks.GRAVEL.defaultBlockState()));
		if (currentRuleSource instanceof SurfaceRules.SequenceRuleSource sequenceRuleSource) {
			customSurfaceRules.addAll(sequenceRuleSource.sequence());
			return SurfaceRules.sequence(customSurfaceRules.toArray(SurfaceRules.RuleSource[]::new));
		} else {
			customSurfaceRules.add(currentRuleSource);
			return SurfaceRules.sequence(customSurfaceRules.toArray(SurfaceRules.RuleSource[]::new));
		}
	}

	public static <T> Climate.ParameterList<T> modifyOverworldParameterPoints(Climate.ParameterList<T> originalList, Function<ResourceKey<Biome>, T> lookup) {
		List<Pair<Climate.ParameterPoint, T>> parameters = new ArrayList<>(originalList.values());
		parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.502f, 0.5035f), Climate.Parameter.span(-0.5005f, 0.5025f), Climate.Parameter.span(0.299f, 1.0005f), Climate.Parameter.span(-0.506f, 0.501f),
				Climate.Parameter.point(0.0f), Climate.Parameter.span(-1.001f, 1.0015f), 0), lookup.apply(ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath("zings_project_red_horn", "windy_snowy_taiga_plains")))));
		parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.502f, 0.5035f), Climate.Parameter.span(-0.5005f, 0.5025f), Climate.Parameter.span(0.299f, 1.0005f), Climate.Parameter.span(-0.506f, 0.501f),
				Climate.Parameter.point(1.0f), Climate.Parameter.span(-1.001f, 1.0015f), 0), lookup.apply(ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath("zings_project_red_horn", "windy_snowy_taiga_plains")))));
		parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.4977f, 0.5004f), Climate.Parameter.span(-0.5011f, 0.5004f), Climate.Parameter.span(0.3011f, 1.0004f), Climate.Parameter.span(-0.4993f, 0.5003f),
				Climate.Parameter.point(0.0f), Climate.Parameter.span(-1.0007f, 1.0003f), 0), lookup.apply(ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath("zings_project_red_horn", "dried_flatlands")))));
		parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.4977f, 0.5004f), Climate.Parameter.span(-0.5011f, 0.5004f), Climate.Parameter.span(0.3011f, 1.0004f), Climate.Parameter.span(-0.4993f, 0.5003f),
				Climate.Parameter.point(1.0f), Climate.Parameter.span(-1.0007f, 1.0003f), 0), lookup.apply(ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath("zings_project_red_horn", "dried_flatlands")))));
		parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.4996f, 0.5023f), Climate.Parameter.span(-0.4999f, 0.5007f), Climate.Parameter.span(0.2975f, 1.0008f), Climate.Parameter.span(-0.5012f, 0.4991f),
				Climate.Parameter.point(0.0f), Climate.Parameter.span(-1.0011f, 1.0009f), 0), lookup.apply(ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath("zings_project_red_horn", "moratorium_beach")))));
		parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.4996f, 0.5023f), Climate.Parameter.span(-0.4999f, 0.5007f), Climate.Parameter.span(0.2975f, 1.0008f), Climate.Parameter.span(-0.5012f, 0.4991f),
				Climate.Parameter.point(1.0f), Climate.Parameter.span(-1.0011f, 1.0009f), 0), lookup.apply(ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath("zings_project_red_horn", "moratorium_beach")))));
		parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.4993f, 0.5001f), Climate.Parameter.span(-0.4992f, 0.5005f), Climate.Parameter.span(0.2999f, 1.0007f), Climate.Parameter.span(-0.5001f, 0.5006f),
				Climate.Parameter.span(0.2f, 0.9f), Climate.Parameter.span(-1.0001f, 1.0001f), 0), lookup.apply(ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath("zings_project_red_horn", "klaxon_caves")))));
		return new Climate.ParameterList<>(parameters);
	}

	private static SurfaceRules.RuleSource preliminarySurfaceRule(ResourceKey<Biome> biomeKey, BlockState groundBlock, BlockState undergroundBlock, BlockState underwaterBlock) {
		return SurfaceRules.ifTrue(SurfaceRules.isBiome(biomeKey),
				SurfaceRules.ifTrue(SurfaceRules.abovePreliminarySurface(),
						SurfaceRules.sequence(
								SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, false, 0, CaveSurface.FLOOR),
										SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.waterBlockCheck(-1, 0), SurfaceRules.state(groundBlock)), SurfaceRules.state(underwaterBlock))),
								SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, true, 0, CaveSurface.FLOOR), SurfaceRules.state(undergroundBlock)))));
	}

	private static SurfaceRules.RuleSource anySurfaceRule(ResourceKey<Biome> biomeKey, BlockState groundBlock, BlockState undergroundBlock, BlockState underwaterBlock) {
		return SurfaceRules.ifTrue(SurfaceRules.isBiome(biomeKey),
				SurfaceRules.ifTrue(SurfaceRules.yBlockCheck(VerticalAnchor.aboveBottom(5), 0),
						SurfaceRules.ifTrue(SurfaceRules.not(SurfaceRules.yBlockCheck(VerticalAnchor.belowTop(5), 0)),
								SurfaceRules.sequence(
										SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, false, 0, CaveSurface.FLOOR),
												SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.waterBlockCheck(-1, 0), SurfaceRules.state(groundBlock)), SurfaceRules.state(underwaterBlock))),
										SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, true, 0, CaveSurface.FLOOR), SurfaceRules.state(undergroundBlock))))));
	}

	public interface ZingsProjectRedHornModNoiseGeneratorSettings {
		void setzings_project_red_hornDimensionTypeReference(Holder<DimensionType> dimensionType);
	}
}