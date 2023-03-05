package me.yoarchh.aimassist.mixin;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.SharedConstants;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(SharedConstants.class)
public class SharedConstantsMixin
{
    // (YoArchh) - Defers the initialization of the DataFixerUpper if we are in a dev environment. Makes the game boot faster.
    @Inject(at = @At("HEAD"), method = "enableDataFixerOptimization", cancellable = true)
    private static void deferDFUInitializationIfInDevEnvironment(CallbackInfo callbackInfo)
    {
        if (FabricLoader.getInstance().isDevelopmentEnvironment())
            callbackInfo.cancel();
    }
}
