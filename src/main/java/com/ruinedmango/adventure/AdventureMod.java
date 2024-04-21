package com.ruinedmango.adventure;

import com.mojang.logging.LogUtils;
import com.ruinedmango.adventure.block.ModBlocks;
import com.ruinedmango.adventure.item.ModCreativeModTabs;
import com.ruinedmango.adventure.item.ModItems;

import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(AdventureMod.MODID)
public class AdventureMod
{
    public static final String MODID = "ruinedadventure";
    private static final Logger LOGGER = LogUtils.getLogger();

    public AdventureMod(IEventBus modEventBus){
    	ModCreativeModTabs.register(modEventBus);
    	
    	ModBlocks.register(modEventBus);
    	
    	ModItems.register(modEventBus);
    	
        modEventBus.addListener(this::commonSetup);
        
        NeoForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event){
    	
    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event){
    	if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
    		event.accept(ModItems.SAPPHIRE);
    		event.accept(ModItems.RAW_SAPPHIRE);
    	}
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event){
    	
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents{
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event){
        	
        }
    }
}
