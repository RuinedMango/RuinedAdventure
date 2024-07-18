package com.ruinedmango.adventure.block;

import com.ruinedmango.adventure.AdventureMod;
import com.ruinedmango.adventure.item.ModItems;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;

public class ModBlocks {
	public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(AdventureMod.MODID);
	
	public static final DeferredBlock<Block> SAPPHIRE_BLOCK = BLOCKS.register("sapphire_block", () -> new Block(BlockBehaviour.Properties
			.ofFullCopy(Blocks.IRON_BLOCK)
			.destroyTime(2)
			.sound(SoundType.AMETHYST)
			.mapColor(MapColor.COLOR_BLUE)));
	public static final DeferredBlock<Block> RAW_SAPPHIRE_BLOCK = BLOCKS.register("raw_sapphire_block", () -> new Block(BlockBehaviour.Properties
			.ofFullCopy(Blocks.IRON_ORE)
			.destroyTime(2)
			.sound(SoundType.AMETHYST)
			.mapColor(MapColor.COLOR_BLUE)));
	
	public static final DeferredBlock<Block> SAPPHIRE_ORE = BLOCKS.register("sapphire_ore", () -> new DropExperienceBlock(UniformInt.of(3, 6) ,BlockBehaviour.Properties
			.ofFullCopy(Blocks.STONE)
			.strength(2f)
			.requiresCorrectToolForDrops()));
	public static final DeferredBlock<Block> DEEPSLATE_SAPPHIRE_ORE = BLOCKS.register("deepslate_sapphire_ore", () -> new DropExperienceBlock(UniformInt.of(3, 7) ,BlockBehaviour.Properties
			.ofFullCopy(Blocks.DEEPSLATE)
			.strength(2f)
			.requiresCorrectToolForDrops()));
	public static final DeferredBlock<Block> NETHER_SAPPHIRE_ORE = BLOCKS.register("nether_sapphire_ore", () -> new DropExperienceBlock(UniformInt.of(3, 7) ,BlockBehaviour.Properties
			.ofFullCopy(Blocks.NETHERRACK)
			.strength(2f)
			.requiresCorrectToolForDrops()));
	public static final DeferredBlock<Block> END_STONE_SAPPHIRE_ORE = BLOCKS.register("end_stone_sapphire_ore", () -> new DropExperienceBlock(UniformInt.of(3, 7) ,BlockBehaviour.Properties
			.ofFullCopy(Blocks.END_STONE)
			.strength(2f)
			.requiresCorrectToolForDrops()));
	
	public static final DeferredItem<BlockItem> SAPPHIRE_BLOCK_ITEM = ModItems.ITEMS.registerSimpleBlockItem("sapphire_block", SAPPHIRE_BLOCK);
	public static final DeferredItem<BlockItem> RAW_SAPPHIRE_BLOCK_ITEM = ModItems.ITEMS.registerSimpleBlockItem("raw_sapphire_block", RAW_SAPPHIRE_BLOCK);
	public static final DeferredItem<BlockItem> SAPPHIRE_ORE_ITEM = ModItems.ITEMS.registerSimpleBlockItem("sapphire_ore", SAPPHIRE_ORE);
	public static final DeferredItem<BlockItem> DEEPSLATE_SAPPHIRE_ORE_ITEM = ModItems.ITEMS.registerSimpleBlockItem("deepslate_sapphire_ore", DEEPSLATE_SAPPHIRE_ORE);
	public static final DeferredItem<BlockItem> NETHER_SAPPHIRE_ORE_ITEM = ModItems.ITEMS.registerSimpleBlockItem("nether_sapphire_ore", NETHER_SAPPHIRE_ORE);
	public static final DeferredItem<BlockItem> END_STONE_SAPPHIRE_ORE_ITEM = ModItems.ITEMS.registerSimpleBlockItem("end_stone_sapphire_ore", END_STONE_SAPPHIRE_ORE);

	public static void register(IEventBus eventBus) {
		BLOCKS.register(eventBus);
	}
}
