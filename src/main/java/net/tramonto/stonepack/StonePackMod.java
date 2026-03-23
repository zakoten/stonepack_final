package net.tramonto.stonepack;
import eu.pb4.polymer.resourcepack.api.PolymerResourcePackUtils;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class StonePackMod implements ModInitializer {
    public static final String MOD_ID = "stonepack";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    @Override
    public void onInitialize() {
        LOGGER.info("Tramonto Stone Pack — loading 143 blocks...");
        ModBlocks.initialize();
        PolymerResourcePackUtils.addModAssets(MOD_ID);
        LOGGER.info("Tramonto Stone Pack — ready!");
    }
}
