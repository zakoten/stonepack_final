package net.tramonto.stonepack;

import eu.pb4.polymer.core.api.item.PolymerItemUtils;
import eu.pb4.polymer.resourcepack.api.PolymerResourcePackUtils;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StonePackMod implements ModInitializer {
    public static final String MOD_ID = "stonepack";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Tramonto Stone Pack — loading 143 blocks...");

        ModBlocks.initialize();

        PolymerItemUtils.ITEM_MODIFICATION_EVENT.register((original, client, context) -> {
            if (original.isOf(ModBlocks.GRANITE_BRICKS.asItem())
                    || original.isOf(ModBlocks.DIORITE_BRICKS.asItem())
                    || original.isOf(ModBlocks.ANDESITE_BRICKS.asItem())
                    || original.isOf(ModBlocks.CALCITE_BRICKS.asItem())
                    || original.isOf(ModBlocks.SANDSTONE_BRICKS.asItem())
                    || original.isOf(ModBlocks.BASALT_BRICKS.asItem())
                    || original.isOf(ModBlocks.RED_SANDSTONE_BRICKS.asItem())
                    || original.isOf(ModBlocks.DRIPSTONE_BRICKS.asItem())) {

                return new ItemStack(Items.RED_STAINED_GLASS, client.getCount());
            }

            return client;
        });

        PolymerResourcePackUtils.addModAssets(MOD_ID);

        LOGGER.info("Tramonto Stone Pack — ready!");
    }
}
