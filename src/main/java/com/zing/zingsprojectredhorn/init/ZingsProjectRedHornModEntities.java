package com.zing.zingsprojectredhorn.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import com.zing.zingsprojectredhorn.entity.*;
import com.zing.zingsprojectredhorn.ZiNGsProjectRedHorn;

@EventBusSubscriber
public class ZingsProjectRedHornModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, ZiNGsProjectRedHorn.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<ZeroTwoEntity>> ZERO_TWO = register("zero_two",
			EntityType.Builder.<ZeroTwoEntity>of(ZeroTwoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().ridingOffset(-0.6f)

					.sized(0.6f, 1.8f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<KlaxonZapperEntity>> KLAXON_ZAPPER = register("klaxon_zapper",
			EntityType.Builder.<KlaxonZapperEntity>of(KlaxonZapperEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<HiroEntity>> HIRO = register("hiro",
			EntityType.Builder.<HiroEntity>of(HiroEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().ridingOffset(-0.6f)

					.sized(0.6f, 1.8f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<ParasiteArrowEntityEntity>> PARASITE_ARROW_ENTITY = register("parasite_arrow_entity",
			EntityType.Builder.<ParasiteArrowEntityEntity>of(ParasiteArrowEntityEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<MaskedVindicatorEntity>> MASKED_VINDICATOR = register("masked_vindicator",
			EntityType.Builder.<MaskedVindicatorEntity>of(MaskedVindicatorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.6f, 1.95f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<MaskedVillagerEntity>> MASKED_VILLAGER = register("masked_villager",
			EntityType.Builder.<MaskedVillagerEntity>of(MaskedVillagerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.6f, 1.95f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<MaskedPillagerEntity>> MASKED_PILLAGER = register("masked_pillager",
			EntityType.Builder.<MaskedPillagerEntity>of(MaskedPillagerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.6f, 1.95f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<MaskedIllusionerEntity>> MASKED_ILLUSIONER = register("masked_illusioner",
			EntityType.Builder.<MaskedIllusionerEntity>of(MaskedIllusionerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.6f, 1.95f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<MeekoniEntity>> MEEKONI = register("meekoni",
			EntityType.Builder.<MeekoniEntity>of(MeekoniEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<KlaxonBirdzingEntity>> KLAXON_BIRDZING = register("klaxon_birdzing",
			EntityType.Builder.<KlaxonBirdzingEntity>of(KlaxonBirdzingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 0.5f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<KlaxonGooEntity>> KLAXON_GOO = register("klaxon_goo",
			EntityType.Builder.<KlaxonGooEntity>of(KlaxonGooEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<KlaxonBeamEntity>> KLAXON_BEAM = register("klaxon_beam",
			EntityType.Builder.<KlaxonBeamEntity>of(KlaxonBeamEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<KlaxonCreeperEntity>> KLAXON_CREEPER = register("klaxon_creeper",
			EntityType.Builder.<KlaxonCreeperEntity>of(KlaxonCreeperEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.notInPeaceful().sized(0.6f, 1.8f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<KlaxonZombieEntity>> KLAXON_ZOMBIE = register("klaxon_zombie",
			EntityType.Builder.<KlaxonZombieEntity>of(KlaxonZombieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.6f, 1.8f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<KlaxonSpiderEntity>> KLAXON_SPIDER = register("klaxon_spider",
			EntityType.Builder.<KlaxonSpiderEntity>of(KlaxonSpiderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.6f, 0.5f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<KlaxonSkeletonEntity>> KLAXON_SKELETON = register("klaxon_skeleton",
			EntityType.Builder.<KlaxonSkeletonEntity>of(KlaxonSkeletonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.6f, 1.8f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<SoulessZeroTwoEntity>> SOULESS_ZERO_TWO = register("souless_zero_two",
			EntityType.Builder.<SoulessZeroTwoEntity>of(SoulessZeroTwoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f)

					.sized(0.6f, 1.8f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<SoulOfZeroTwoEntity>> SOUL_OF_ZERO_TWO = register("soul_of_zero_two",
			EntityType.Builder.<SoulOfZeroTwoEntity>of(SoulOfZeroTwoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().ridingOffset(-0.6f)

					.sized(0.6f, 1.8f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<SoulOfHiroEntity>> SOUL_OF_HIRO = register("soul_of_hiro",
			EntityType.Builder.<SoulOfHiroEntity>of(SoulOfHiroEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().ridingOffset(-0.6f)

					.sized(0.6f, 1.8f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<SoulessHiroEntity>> SOULESS_HIRO = register("souless_hiro",
			EntityType.Builder.<SoulessHiroEntity>of(SoulessHiroEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f)

					.sized(0.6f, 1.8f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<ZeroThreeEntity>> ZERO_THREE = register("zero_three",
			EntityType.Builder.<ZeroThreeEntity>of(ZeroThreeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().ridingOffset(-0.6f)

					.sized(0.6f, 1.8f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<ZeroFourEntity>> ZERO_FOUR = register("zero_four",
			EntityType.Builder.<ZeroFourEntity>of(ZeroFourEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().ridingOffset(-0.6f)

					.sized(0.6f, 1.8f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<IchigoEntity>> ICHIGO = register("ichigo",
			EntityType.Builder.<IchigoEntity>of(IchigoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f)

					.sized(0.6f, 1.8f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<FerrorockWillowBoatEntity>> FERROROCK_WILLOW_BOAT = register("ferrorock_willow_boat",
			EntityType.Builder.<FerrorockWillowBoatEntity>of(FerrorockWillowBoatEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<FerrorockWillowBoatWithChestEntity>> FERROROCK_WILLOW_BOAT_WITH_CHEST = register("ferrorock_willow_boat_with_chest",
			EntityType.Builder.<FerrorockWillowBoatWithChestEntity>of(FerrorockWillowBoatWithChestEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<ZeroPlateaRaftEntity>> ZERO_PLATEA_RAFT = register("zero_platea_raft",
			EntityType.Builder.<ZeroPlateaRaftEntity>of(ZeroPlateaRaftEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<ZeroPlateaRaftWithChestEntity>> ZERO_PLATEA_RAFT_WITH_CHEST = register("zero_platea_raft_with_chest",
			EntityType.Builder.<ZeroPlateaRaftWithChestEntity>of(ZeroPlateaRaftWithChestEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(ZiNGsProjectRedHorn.MODID, registryname))));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		ZeroTwoEntity.init(event);
		HiroEntity.init(event);
		MaskedVindicatorEntity.init(event);
		MaskedVillagerEntity.init(event);
		MaskedPillagerEntity.init(event);
		MaskedIllusionerEntity.init(event);
		MeekoniEntity.init(event);
		KlaxonBirdzingEntity.init(event);
		KlaxonCreeperEntity.init(event);
		KlaxonZombieEntity.init(event);
		KlaxonSpiderEntity.init(event);
		KlaxonSkeletonEntity.init(event);
		SoulessZeroTwoEntity.init(event);
		SoulOfZeroTwoEntity.init(event);
		SoulOfHiroEntity.init(event);
		SoulessHiroEntity.init(event);
		ZeroThreeEntity.init(event);
		ZeroFourEntity.init(event);
		IchigoEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ZERO_TWO.get(), ZeroTwoEntity.createAttributes().build());
		event.put(HIRO.get(), HiroEntity.createAttributes().build());
		event.put(MASKED_VINDICATOR.get(), MaskedVindicatorEntity.createAttributes().build());
		event.put(MASKED_VILLAGER.get(), MaskedVillagerEntity.createAttributes().build());
		event.put(MASKED_PILLAGER.get(), MaskedPillagerEntity.createAttributes().build());
		event.put(MASKED_ILLUSIONER.get(), MaskedIllusionerEntity.createAttributes().build());
		event.put(MEEKONI.get(), MeekoniEntity.createAttributes().build());
		event.put(KLAXON_BIRDZING.get(), KlaxonBirdzingEntity.createAttributes().build());
		event.put(KLAXON_CREEPER.get(), KlaxonCreeperEntity.createAttributes().build());
		event.put(KLAXON_ZOMBIE.get(), KlaxonZombieEntity.createAttributes().build());
		event.put(KLAXON_SPIDER.get(), KlaxonSpiderEntity.createAttributes().build());
		event.put(KLAXON_SKELETON.get(), KlaxonSkeletonEntity.createAttributes().build());
		event.put(SOULESS_ZERO_TWO.get(), SoulessZeroTwoEntity.createAttributes().build());
		event.put(SOUL_OF_ZERO_TWO.get(), SoulOfZeroTwoEntity.createAttributes().build());
		event.put(SOUL_OF_HIRO.get(), SoulOfHiroEntity.createAttributes().build());
		event.put(SOULESS_HIRO.get(), SoulessHiroEntity.createAttributes().build());
		event.put(ZERO_THREE.get(), ZeroThreeEntity.createAttributes().build());
		event.put(ZERO_FOUR.get(), ZeroFourEntity.createAttributes().build());
		event.put(ICHIGO.get(), IchigoEntity.createAttributes().build());
	}
}