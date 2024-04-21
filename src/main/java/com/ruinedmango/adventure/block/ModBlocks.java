package com.ruinedmango.adventure.block;

import com.ruinedmango.adventure.AdventureMod;
import com.ruinedmango.adventure.item.ModItems;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;

public class ModBlocks {
	public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(AdventureMod.MODID);
	
	public static final DeferredBlock<Block> SAPPHIRE_BLOCK = BLOCKS.registerSimpleBlock("sapphire_block", BlockBehaviour.Properties
			.ofFullCopy(Blocks.IRON_BLOCK)
			.sound(SoundType.AMETHYST)
			.mapColor(MapColor.COLOR_BLUE));
	public static final DeferredBlock<Block> RAW_SAPPHIRE_BLOCK = BLOCKS.registerSimpleBlock("raw_sapphire_block", BlockBehaviour.Properties
			.ofFullCopy(Blocks.IRON_ORE)
			.sound(SoundType.AMETHYST)
			.mapColor(MapColor.COLOR_BLUE));
	
	public static final DeferredItem<BlockItem> SAPPHIRE_BLOCK_ITEM = ModItems.ITEMS.registerSimpleBlockItem("sapphire_block", SAPPHIRE_BLOCK);
	public static final DeferredItem<BlockItem> RAW_SAPPHIRE_BLOCK_ITEM = ModItems.ITEMS.registerSimpleBlockItem("raw_sapphire_block", RAW_SAPPHIRE_BLOCK);

	public static void register(IEventBus eventBus) {
		BLOCKS.register(eventBus);
	}
}
