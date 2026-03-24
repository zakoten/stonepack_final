package net.tramonto.stonepack;

import commonnetwork.networking.data.PacketContext;
import eu.pb4.polymer.core.api.item.PolymerItem;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class StonepackPolymerBlockItem extends BlockItem implements PolymerItem {

    public StonepackPolymerBlockItem(Block block, Item.Settings settings) {
        super(block, settings);
    }

    @Override
    public Item getPolymerItem(ItemStack itemStack, PacketContext context) {
        return Items.RED_STAINED_GLASS;
    }
}
