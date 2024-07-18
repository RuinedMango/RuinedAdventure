package com.ruinedmango.adventure.mixin;

import org.slf4j.Logger;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.mojang.logging.LogUtils;

import net.minecraft.client.gui.screens.PauseScreen;

@Mixin(PauseScreen.class)
public class PauseScreenMixin {
	private static final Logger LOGGER = LogUtils.getLogger();
	
	@Inject(at = @At(value = "HEAD"), method = "createPauseMenu()V", cancellable = false)
	public void createPauseMenuChanges(CallbackInfo ci) {
		LOGGER.info("Get mixed in nigga");
	}
}
