package net.tramonto.stonepack;

import eu.pb4.polymer.core.api.item.PolymerBlockItem;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class StonepackPolymerBlockItem extends PolymerBlockItem {

    public StonepackPolymerBlockItem(Block block, Settings settings) {
        super(block, settings);
    }

    @Override
    public Item getPolymerItem(ItemStack itemStack, Item.Settings settings) {
        return Items.RED_STAINED_GLASS;
    }
}
