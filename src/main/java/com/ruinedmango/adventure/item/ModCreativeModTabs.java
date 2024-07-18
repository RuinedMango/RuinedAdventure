package com.ruinedmango.adventure.item;

import com.ruinedmango.adventure.AdventureMod;
import com.ruinedmango.adventure.block.ModBlocks;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModCreativeModTabs {
	public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AdventureMod.MODID);
	
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ADVENTURE_TAB = CREATIVE_MODE_TABS.register("adventure_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE.get()))
			.title(Component.translatable("creativetab.adventure_tab"))
			.displayItems((pParameters, pOutput) -> {
				pOutput.accept(ModItems.SAPPHIRE.get());
				pOutput.accept(ModItems.RAW_SAPPHIRE.get());
				pOutput.accept(ModBlocks.SAPPHIRE_BLOCK_ITEM.get());
				pOutput.accept(ModBlocks.RAW_SAPPHIRE_BLOCK_ITEM.get());
				
				pOutput.accept(ModBlocks.SAPPHIRE_ORE.get());
				pOutput.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
				pOutput.accept(ModBlocks.NETHER_SAPPHIRE_ORE.get());
				pOutput.accept(ModBlocks.END_STONE_SAPPHIRE_ORE.get());
			})
			.build());
	
	public static void register(IEventBus eventBus) {
		CREATIVE_MODE_TABS.register(eventBus);
	}
}
