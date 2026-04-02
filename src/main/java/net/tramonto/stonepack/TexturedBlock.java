package net.tramonto.stonepack;

import eu.pb4.polymer.core.api.block.SimplePolymerBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;

public class TexturedBlock extends SimplePolymerBlock {
    private final BlockState clientState;

    public TexturedBlock(Block base, BlockState clientState, AbstractBlock.Settings settings) {
        super(settings, base);
        this.clientState = clientState;
    }

    @Override
    public BlockState getPolymerBlockState(BlockState state) {
        return this.clientState;
    }
}
