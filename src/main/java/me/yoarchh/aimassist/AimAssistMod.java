package me.yoarchh.aimassist;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

@Environment(EnvType.CLIENT)
public class AimAssistMod implements ClientModInitializer
{
    private static AimAssistMod INSTANCE;

    private static final Logger LOGGER = (Logger) LogManager.getLogger("Aim Assist");
    @Override
    public void onInitializeClient()
    {
        INSTANCE = this;

        LOGGER.info("Initialized Aim Assist!");
    }

    public static AimAssistMod getInstance() { return INSTANCE; }

    public static Logger getLogger() { return LOGGER; }
}
