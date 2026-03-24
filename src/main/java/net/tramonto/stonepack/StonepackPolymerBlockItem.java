package net.tramonto.stonepack;

import eu.pb4.polymer.core.api.item.PolymerItem;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.network.ServerPlayerEntity;
import org.jetbrains.annotations.Nullable;

public class StonepackPolymerBlockItem extends BlockItem implements PolymerItem {

    public StonepackPolymerBlockItem(Block block, Item.Settings settings) {
        super(block, settings);
    }

    @Override
    public ItemStack getPolymerItemStack(ItemStack itemStack, @Nullable ServerPlayerEntity player) {
        return new ItemStack(Items.RED_STAINED_GLASS, itemStack.getCount());
    }
}
