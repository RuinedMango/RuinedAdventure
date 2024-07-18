package com.ruinedmango.adventure.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

import net.minecraft.client.gui.components.SplashRenderer;

@Mixin(SplashRenderer.class)
public interface SplashRendererAccessor {
	@Accessor("splash")
	String ruinedadventure$getSplash();
	
	@Mutable
	@Accessor("splash")
	void ruinedadventure$setSplash(String splash);
}
