package net.tramonto.stonepack;

import eu.pb4.polymer.core.api.item.PolymerItemUtils;
import eu.pb4.polymer.resourcepack.api.PolymerResourcePackUtils;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
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
            Identifier itemId = Registries.ITEM.getId(original.getItem());

            if (itemId != null && MOD_ID.equals(itemId.getNamespace())) {
                ItemStack out = new ItemStack(Items.RED_STAINED_GLASS, client.getCount());
                out.setCustomName(
                        Text.literal("Resource Pack Required")
                                .formatted(Formatting.RED)
                );
                return out;
            }

            return client;
        });

        PolymerResourcePackUtils.addModAssets(MOD_ID);

        LOGGER.info("Tramonto Stone Pack — ready!");
    }
}
