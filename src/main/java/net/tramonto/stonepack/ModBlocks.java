package net.tramonto.stonepack;

import eu.pb4.polymer.core.api.block.SimplePolymerBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import eu.pb4.polymer.core.api.item.PolymerBlockItem;

public class ModBlocks {

    // ── BRICKS (8) ──────────────────────────────────────────────
    public static final Block GRANITE_BRICKS           = reg("granite_bricks",           Blocks.GRANITE,                   3.0f, 6.0f);
    public static final Block DIORITE_BRICKS           = reg("diorite_bricks",           Blocks.DIORITE,                   3.0f, 6.0f);
    public static final Block ANDESITE_BRICKS          = reg("andesite_bricks",          Blocks.ANDESITE,                  3.0f, 6.0f);
    public static final Block CALCITE_BRICKS           = reg("calcite_bricks",           Blocks.CALCITE,                   0.75f, 0.75f);
    public static final Block SANDSTONE_BRICKS         = reg("sandstone_bricks",         Blocks.SANDSTONE,                 0.8f, 0.8f);
    public static final Block BASALT_BRICKS            = reg("basalt_bricks",            Blocks.BASALT,                    1.25f, 4.2f);
    public static final Block RED_SANDSTONE_BRICKS     = reg("red_sandstone_bricks",     Blocks.RED_SANDSTONE,             0.8f, 0.8f);
    public static final Block DRIPSTONE_BRICKS         = reg("dripstone_bricks",         Blocks.DRIPSTONE_BLOCK,           1.5f, 1.5f);

    // ── CRACKED BRICKS (11) ─────────────────────────────────────
    public static final Block GRANITE_CRACKED_BRICKS       = reg("granite_cracked_bricks",       Blocks.GRANITE,           3.0f, 6.0f);
    public static final Block DIORITE_CRACKED_BRICKS       = reg("diorite_cracked_bricks",       Blocks.DIORITE,           3.0f, 6.0f);
    public static final Block ANDESITE_CRACKED_BRICKS      = reg("andesite_cracked_bricks",      Blocks.ANDESITE,          3.0f, 6.0f);
    public static final Block CALCITE_CRACKED_BRICKS       = reg("calcite_cracked_bricks",       Blocks.CALCITE,           0.75f, 0.75f);
    public static final Block TUFF_CRACKED_BRICKS          = reg("tuff_cracked_bricks",          Blocks.TUFF_BRICKS,       1.5f, 6.0f);
    public static final Block SANDSTONE_CRACKED_BRICKS     = reg("sandstone_cracked_bricks",     Blocks.SANDSTONE,         0.8f, 0.8f);
    public static final Block BASALT_CRACKED_BRICKS        = reg("basalt_cracked_bricks",        Blocks.BASALT,            1.25f, 4.2f);
    public static final Block END_STONE_CRACKED_BRICKS     = reg("end_stone_cracked_bricks",     Blocks.END_STONE_BRICKS,  3.0f, 9.0f);
    public static final Block PRISMARINE_CRACKED_BRICKS    = reg("prismarine_cracked_bricks",    Blocks.PRISMARINE_BRICKS, 1.5f, 6.0f);
    public static final Block RED_SANDSTONE_CRACKED_BRICKS = reg("red_sandstone_cracked_bricks", Blocks.RED_SANDSTONE,     0.8f, 0.8f);
    public static final Block DRIPSTONE_CRACKED_BRICKS     = reg("dripstone_cracked_bricks",     Blocks.DRIPSTONE_BLOCK,   1.5f, 1.5f);

    // ── CHISELED (8) ────────────────────────────────────────────
    public static final Block GRANITE_CHISELED    = reg("granite_chiseled",    Blocks.CHISELED_STONE_BRICKS,        3.0f, 6.0f);
    public static final Block DIORITE_CHISELED    = reg("diorite_chiseled",    Blocks.CHISELED_STONE_BRICKS,        3.0f, 6.0f);
    public static final Block ANDESITE_CHISELED   = reg("andesite_chiseled",   Blocks.CHISELED_STONE_BRICKS,        3.0f, 6.0f);
    public static final Block CALCITE_CHISELED    = reg("calcite_chiseled",    Blocks.CALCITE,                      0.75f, 0.75f);
    public static final Block BASALT_CHISELED     = reg("basalt_chiseled",     Blocks.CHISELED_POLISHED_BLACKSTONE, 1.25f, 4.2f);
    public static final Block END_STONE_CHISELED  = reg("end_stone_chiseled",  Blocks.CHISELED_STONE_BRICKS,        3.0f, 9.0f);
    public static final Block PRISMARINE_CHISELED = reg("prismarine_chiseled", Blocks.PRISMARINE_BRICKS,            1.5f, 6.0f);
    public static final Block DRIPSTONE_CHISELED  = reg("dripstone_chiseled",  Blocks.DRIPSTONE_BLOCK,              1.5f, 1.5f);

    // ── SMOOTH (10) ─────────────────────────────────────────────
    public static final Block GRANITE_SMOOTH    = reg("granite_smooth",    Blocks.SMOOTH_STONE,        3.0f, 6.0f);
    public static final Block DIORITE_SMOOTH    = reg("diorite_smooth",    Blocks.SMOOTH_STONE,        3.0f, 6.0f);
    public static final Block ANDESITE_SMOOTH   = reg("andesite_smooth",   Blocks.SMOOTH_STONE,        3.0f, 6.0f);
    public static final Block DEEPSLATE_SMOOTH  = reg("deepslate_smooth",  Blocks.POLISHED_DEEPSLATE,  3.5f, 6.0f);
    public static final Block CALCITE_SMOOTH    = reg("calcite_smooth",    Blocks.SMOOTH_STONE,        0.75f, 0.75f);
    public static final Block TUFF_SMOOTH       = reg("tuff_smooth",       Blocks.POLISHED_TUFF,       1.5f, 6.0f);
    public static final Block END_STONE_SMOOTH  = reg("end_stone_smooth",  Blocks.SMOOTH_STONE,        3.0f, 9.0f);
    public static final Block PRISMARINE_SMOOTH = reg("prismarine_smooth", Blocks.SMOOTH_STONE,        1.5f, 6.0f);
    public static final Block BLACKSTONE_SMOOTH = reg("blackstone_smooth", Blocks.POLISHED_BLACKSTONE, 1.5f, 6.0f);
    public static final Block DRIPSTONE_SMOOTH  = reg("dripstone_smooth",  Blocks.SMOOTH_STONE,        1.5f, 1.5f);

    // ── POLISHED (7) ────────────────────────────────────────────
    public static final Block STONE_POLISHED         = reg("stone_polished",         Blocks.POLISHED_GRANITE,     1.5f, 6.0f);
    public static final Block CALCITE_POLISHED       = reg("calcite_polished",       Blocks.POLISHED_GRANITE,     0.75f, 0.75f);
    public static final Block SANDSTONE_POLISHED     = reg("sandstone_polished",     Blocks.SMOOTH_SANDSTONE,     0.8f, 0.8f);
    public static final Block END_STONE_POLISHED     = reg("end_stone_polished",     Blocks.POLISHED_GRANITE,     3.0f, 9.0f);
    public static final Block PRISMARINE_POLISHED    = reg("prismarine_polished",    Blocks.POLISHED_GRANITE,     1.5f, 6.0f);
    public static final Block RED_SANDSTONE_POLISHED = reg("red_sandstone_polished", Blocks.SMOOTH_RED_SANDSTONE, 0.8f, 0.8f);
    public static final Block DRIPSTONE_POLISHED     = reg("dripstone_polished",     Blocks.POLISHED_GRANITE,     1.5f, 1.5f);

    // ── TILES (13) ──────────────────────────────────────────────
    public static final Block STONE_TILES         = reg("stone_tiles",         Blocks.STONE_BRICKS,               1.5f, 6.0f);
    public static final Block GRANITE_TILES       = reg("granite_tiles",       Blocks.STONE_BRICKS,               3.0f, 6.0f);
    public static final Block DIORITE_TILES       = reg("diorite_tiles",       Blocks.STONE_BRICKS,               3.0f, 6.0f);
    public static final Block ANDESITE_TILES      = reg("andesite_tiles",      Blocks.STONE_BRICKS,               3.0f, 6.0f);
    public static final Block CALCITE_TILES       = reg("calcite_tiles",       Blocks.STONE_BRICKS,               0.75f, 0.75f);
    public static final Block TUFF_TILES          = reg("tuff_tiles",          Blocks.TUFF_BRICKS,                1.5f, 6.0f);
    public static final Block SANDSTONE_TILES     = reg("sandstone_tiles",     Blocks.STONE_BRICKS,               0.8f, 0.8f);
    public static final Block BASALT_TILES        = reg("basalt_tiles",        Blocks.STONE_BRICKS,               1.25f, 4.2f);
    public static final Block END_STONE_TILES     = reg("end_stone_tiles",     Blocks.END_STONE_BRICKS,           3.0f, 9.0f);
    public static final Block PRISMARINE_TILES    = reg("prismarine_tiles",    Blocks.PRISMARINE_BRICKS,          1.5f, 6.0f);
    public static final Block RED_SANDSTONE_TILES = reg("red_sandstone_tiles", Blocks.STONE_BRICKS,               0.8f, 0.8f);
    public static final Block BLACKSTONE_TILES    = reg("blackstone_tiles",    Blocks.POLISHED_BLACKSTONE_BRICKS, 1.5f, 6.0f);
    public static final Block DRIPSTONE_TILES     = reg("dripstone_tiles",     Blocks.STONE_BRICKS,               1.5f, 1.5f);

    // ── COBBLED (11) ────────────────────────────────────────────
    public static final Block COBBLED_GRANITE       = reg("cobbled_granite",       Blocks.COBBLESTONE, 1.5f, 6.0f);
    public static final Block COBBLED_DIORITE       = reg("cobbled_diorite",       Blocks.COBBLESTONE, 1.5f, 6.0f);
    public static final Block COBBLED_ANDESITE      = reg("cobbled_andesite",      Blocks.COBBLESTONE, 1.5f, 6.0f);
    public static final Block COBBLED_CALCITE       = reg("cobbled_calcite",       Blocks.COBBLESTONE, 0.75f, 0.75f);
    public static final Block COBBLED_TUFF          = reg("cobbled_tuff",          Blocks.COBBLESTONE, 1.5f, 6.0f);
    public static final Block COBBLED_BASALT        = reg("cobbled_basalt",        Blocks.COBBLESTONE, 1.25f, 4.2f);
    public static final Block COBBLED_END_STONE     = reg("cobbled_end_stone",     Blocks.COBBLESTONE, 3.0f, 9.0f);
    public static final Block COBBLED_PRISMARINE    = reg("cobbled_prismarine",    Blocks.COBBLESTONE, 1.5f, 6.0f);
    public static final Block COBBLED_SANDSTONE     = reg("cobbled_sandstone",     Blocks.COBBLESTONE, 0.8f, 0.8f);
    public static final Block COBBLED_RED_SANDSTONE = reg("cobbled_red_sandstone", Blocks.COBBLESTONE, 0.8f, 0.8f);
    public static final Block COBBLED_DRIPSTONE     = reg("cobbled_dripstone",     Blocks.COBBLESTONE, 1.5f, 1.5f);

    // ── MOSSY BASE (11) ─────────────────────────────────────────
    public static final Block MOSSY_GRANITE       = reg("mossy_granite",       Blocks.MOSSY_COBBLESTONE, 1.5f, 6.0f);
    public static final Block MOSSY_DIORITE       = reg("mossy_diorite",       Blocks.MOSSY_COBBLESTONE, 1.5f, 6.0f);
    public static final Block MOSSY_ANDESITE      = reg("mossy_andesite",      Blocks.MOSSY_COBBLESTONE, 1.5f, 6.0f);
    public static final Block MOSSY_CALCITE       = reg("mossy_calcite",       Blocks.MOSSY_COBBLESTONE, 0.75f, 0.75f);
    public static final Block MOSSY_TUFF          = reg("mossy_tuff",          Blocks.MOSSY_COBBLESTONE, 1.5f, 6.0f);
    public static final Block MOSSY_BASALT        = reg("mossy_basalt",        Blocks.MOSSY_COBBLESTONE, 1.25f, 4.2f);
    public static final Block MOSSY_END_STONE     = reg("mossy_end_stone",     Blocks.MOSSY_COBBLESTONE, 3.0f, 9.0f);
    public static final Block MOSSY_PRISMARINE    = reg("mossy_prismarine",    Blocks.MOSSY_COBBLESTONE, 1.5f, 6.0f);
    public static final Block MOSSY_SANDSTONE     = reg("mossy_sandstone",     Blocks.MOSSY_COBBLESTONE, 0.8f, 0.8f);
    public static final Block MOSSY_RED_SANDSTONE = reg("mossy_red_sandstone", Blocks.MOSSY_COBBLESTONE, 0.8f, 0.8f);
    public static final Block MOSSY_DRIPSTONE     = reg("mossy_dripstone",     Blocks.MOSSY_COBBLESTONE, 1.5f, 1.5f);

    // ── MOSSY COBBLED (12) ──────────────────────────────────────
    public static final Block MOSSY_COBBLED_GRANITE       = reg("mossy_cobbled_granite",       Blocks.MOSSY_COBBLESTONE, 1.5f, 6.0f);
    public static final Block MOSSY_COBBLED_DIORITE       = reg("mossy_cobbled_diorite",       Blocks.MOSSY_COBBLESTONE, 1.5f, 6.0f);
    public static final Block MOSSY_COBBLED_ANDESITE      = reg("mossy_cobbled_andesite",      Blocks.MOSSY_COBBLESTONE, 1.5f, 6.0f);
    public static final Block MOSSY_COBBLED_CALCITE       = reg("mossy_cobbled_calcite",       Blocks.MOSSY_COBBLESTONE, 0.75f, 0.75f);
    public static final Block MOSSY_COBBLED_TUFF          = reg("mossy_cobbled_tuff",          Blocks.MOSSY_COBBLESTONE, 1.5f, 6.0f);
    public static final Block MOSSY_COBBLED_BASALT        = reg("mossy_cobbled_basalt",        Blocks.MOSSY_COBBLESTONE, 1.25f, 4.2f);
    public static final Block MOSSY_COBBLED_END_STONE     = reg("mossy_cobbled_end_stone",     Blocks.MOSSY_COBBLESTONE, 3.0f, 9.0f);
    public static final Block MOSSY_COBBLED_PRISMARINE    = reg("mossy_cobbled_prismarine",    Blocks.MOSSY_COBBLESTONE, 1.5f, 6.0f);
    public static final Block MOSSY_COBBLED_SANDSTONE     = reg("mossy_cobbled_sandstone",     Blocks.MOSSY_COBBLESTONE, 0.8f, 0.8f);
    public static final Block MOSSY_COBBLED_RED_SANDSTONE = reg("mossy_cobbled_red_sandstone", Blocks.MOSSY_COBBLESTONE, 0.8f, 0.8f);
    public static final Block MOSSY_COBBLED_DRIPSTONE     = reg("mossy_cobbled_dripstone",     Blocks.MOSSY_COBBLESTONE, 1.5f, 1.5f);
    public static final Block MOSSY_COBBLED_BLACKSTONE    = reg("mossy_cobbled_blackstone",    Blocks.MOSSY_COBBLESTONE, 1.5f, 6.0f);

    // ── MOSSY BRICKS (11) ───────────────────────────────────────
    public static final Block MOSSY_GRANITE_BRICKS       = reg("mossy_granite_bricks",       Blocks.MOSSY_STONE_BRICKS, 1.5f, 6.0f);
    public static final Block MOSSY_DIORITE_BRICKS       = reg("mossy_diorite_bricks",       Blocks.MOSSY_STONE_BRICKS, 1.5f, 6.0f);
    public static final Block MOSSY_ANDESITE_BRICKS      = reg("mossy_andesite_bricks",      Blocks.MOSSY_STONE_BRICKS, 1.5f, 6.0f);
    public static final Block MOSSY_CALCITE_BRICKS       = reg("mossy_calcite_bricks",       Blocks.MOSSY_STONE_BRICKS, 0.75f, 0.75f);
    public static final Block MOSSY_TUFF_BRICKS          = reg("mossy_tuff_bricks",          Blocks.MOSSY_STONE_BRICKS, 1.5f, 6.0f);
    public static final Block MOSSY_BASALT_BRICKS        = reg("mossy_basalt_bricks",        Blocks.MOSSY_STONE_BRICKS, 1.25f, 4.2f);
    public static final Block MOSSY_END_STONE_BRICKS     = reg("mossy_end_stone_bricks",     Blocks.MOSSY_STONE_BRICKS, 3.0f, 9.0f);
    public static final Block MOSSY_PRISMARINE_BRICKS    = reg("mossy_prismarine_bricks",    Blocks.MOSSY_STONE_BRICKS, 1.5f, 6.0f);
    public static final Block MOSSY_SANDSTONE_BRICKS     = reg("mossy_sandstone_bricks",     Blocks.MOSSY_STONE_BRICKS, 0.8f, 0.8f);
    public static final Block MOSSY_RED_SANDSTONE_BRICKS = reg("mossy_red_sandstone_bricks", Blocks.MOSSY_STONE_BRICKS, 0.8f, 0.8f);
    public static final Block MOSSY_DRIPSTONE_BRICKS     = reg("mossy_dripstone_bricks",     Blocks.MOSSY_STONE_BRICKS, 1.5f, 1.5f);

    // ── MOSSY SMOOTH (10) ───────────────────────────────────────
    public static final Block MOSSY_GRANITE_SMOOTH    = reg("mossy_granite_smooth",    Blocks.MOSSY_COBBLESTONE, 1.5f, 6.0f);
    public static final Block MOSSY_DIORITE_SMOOTH    = reg("mossy_diorite_smooth",    Blocks.MOSSY_COBBLESTONE, 1.5f, 6.0f);
    public static final Block MOSSY_ANDESITE_SMOOTH   = reg("mossy_andesite_smooth",   Blocks.MOSSY_COBBLESTONE, 1.5f, 6.0f);
    public static final Block MOSSY_DEEPSLATE_SMOOTH  = reg("mossy_deepslate_smooth",  Blocks.MOSSY_COBBLESTONE, 3.5f, 6.0f);
    public static final Block MOSSY_CALCITE_SMOOTH    = reg("mossy_calcite_smooth",    Blocks.MOSSY_COBBLESTONE, 0.75f, 0.75f);
    public static final Block MOSSY_TUFF_SMOOTH       = reg("mossy_tuff_smooth",       Blocks.MOSSY_COBBLESTONE, 1.5f, 6.0f);
    public static final Block MOSSY_END_STONE_SMOOTH  = reg("mossy_end_stone_smooth",  Blocks.MOSSY_COBBLESTONE, 3.0f, 9.0f);
    public static final Block MOSSY_PRISMARINE_SMOOTH = reg("mossy_prismarine_smooth", Blocks.MOSSY_COBBLESTONE, 1.5f, 6.0f);
    public static final Block MOSSY_BLACKSTONE_SMOOTH = reg("mossy_blackstone_smooth", Blocks.MOSSY_COBBLESTONE, 1.5f, 6.0f);
    public static final Block MOSSY_DRIPSTONE_SMOOTH  = reg("mossy_dripstone_smooth",  Blocks.MOSSY_COBBLESTONE, 1.5f, 1.5f);

    // ── MOSSY POLISHED (7) ──────────────────────────────────────
    public static final Block MOSSY_STONE_POLISHED         = reg("mossy_stone_polished",         Blocks.MOSSY_COBBLESTONE, 1.5f, 6.0f);
    public static final Block MOSSY_CALCITE_POLISHED       = reg("mossy_calcite_polished",       Blocks.MOSSY_COBBLESTONE, 0.75f, 0.75f);
    public static final Block MOSSY_SANDSTONE_POLISHED     = reg("mossy_sandstone_polished",     Blocks.MOSSY_COBBLESTONE, 0.8f, 0.8f);
    public static final Block MOSSY_END_STONE_POLISHED     = reg("mossy_end_stone_polished",     Blocks.MOSSY_COBBLESTONE, 3.0f, 9.0f);
    public static final Block MOSSY_PRISMARINE_POLISHED    = reg("mossy_prismarine_polished",    Blocks.MOSSY_COBBLESTONE, 1.5f, 6.0f);
    public static final Block MOSSY_RED_SANDSTONE_POLISHED = reg("mossy_red_sandstone_polished", Blocks.MOSSY_COBBLESTONE, 0.8f, 0.8f);
    public static final Block MOSSY_DRIPSTONE_POLISHED     = reg("mossy_dripstone_polished",     Blocks.MOSSY_COBBLESTONE, 1.5f, 1.5f);

    // ── MOSSY TILES (13) ────────────────────────────────────────
    public static final Block MOSSY_STONE_TILES         = reg("mossy_stone_tiles",         Blocks.MOSSY_STONE_BRICKS, 1.5f, 6.0f);
    public static final Block MOSSY_GRANITE_TILES       = reg("mossy_granite_tiles",       Blocks.MOSSY_STONE_BRICKS, 1.5f, 6.0f);
    public static final Block MOSSY_DIORITE_TILES       = reg("mossy_diorite_tiles",       Blocks.MOSSY_STONE_BRICKS, 1.5f, 6.0f);
    public static final Block MOSSY_ANDESITE_TILES      = reg("mossy_andesite_tiles",      Blocks.MOSSY_STONE_BRICKS, 1.5f, 6.0f);
    public static final Block MOSSY_CALCITE_TILES       = reg("mossy_calcite_tiles",       Blocks.MOSSY_STONE_BRICKS, 0.75f, 0.75f);
    public static final Block MOSSY_TUFF_TILES          = reg("mossy_tuff_tiles",          Blocks.MOSSY_STONE_BRICKS, 1.5f, 6.0f);
    public static final Block MOSSY_SANDSTONE_TILES     = reg("mossy_sandstone_tiles",     Blocks.MOSSY_STONE_BRICKS, 0.8f, 0.8f);
    public static final Block MOSSY_BASALT_TILES        = reg("mossy_basalt_tiles",        Blocks.MOSSY_STONE_BRICKS, 1.25f, 4.2f);
    public static final Block MOSSY_END_STONE_TILES     = reg("mossy_end_stone_tiles",     Blocks.MOSSY_STONE_BRICKS, 3.0f, 9.0f);
    public static final Block MOSSY_PRISMARINE_TILES    = reg("mossy_prismarine_tiles",    Blocks.MOSSY_STONE_BRICKS, 1.5f, 6.0f);
    public static final Block MOSSY_RED_SANDSTONE_TILES = reg("mossy_red_sandstone_tiles", Blocks.MOSSY_STONE_BRICKS, 0.8f, 0.8f);
    public static final Block MOSSY_BLACKSTONE_TILES    = reg("mossy_blackstone_tiles",    Blocks.MOSSY_STONE_BRICKS, 1.5f, 6.0f);
    public static final Block MOSSY_DRIPSTONE_TILES     = reg("mossy_dripstone_tiles",     Blocks.MOSSY_STONE_BRICKS, 1.5f, 1.5f);

    // ── MOSSY CRACKED BRICKS (11) ───────────────────────────────
    public static final Block MOSSY_GRANITE_CRACKED_BRICKS       = reg("mossy_granite_cracked_bricks",       Blocks.MOSSY_STONE_BRICKS, 1.5f, 6.0f);
    public static final Block MOSSY_DIORITE_CRACKED_BRICKS       = reg("mossy_diorite_cracked_bricks",       Blocks.MOSSY_STONE_BRICKS, 1.5f, 6.0f);
    public static final Block MOSSY_ANDESITE_CRACKED_BRICKS      = reg("mossy_andesite_cracked_bricks",      Blocks.MOSSY_STONE_BRICKS, 1.5f, 6.0f);
    public static final Block MOSSY_CALCITE_CRACKED_BRICKS       = reg("mossy_calcite_cracked_bricks",       Blocks.MOSSY_STONE_BRICKS, 0.75f, 0.75f);
    public static final Block MOSSY_TUFF_CRACKED_BRICKS          = reg("mossy_tuff_cracked_bricks",          Blocks.MOSSY_STONE_BRICKS, 1.5f, 6.0f);
    public static final Block MOSSY_SANDSTONE_CRACKED_BRICKS     = reg("mossy_sandstone_cracked_bricks",     Blocks.MOSSY_STONE_BRICKS, 0.8f, 0.8f);
    public static final Block MOSSY_BASALT_CRACKED_BRICKS        = reg("mossy_basalt_cracked_bricks",        Blocks.MOSSY_STONE_BRICKS, 1.25f, 4.2f);
    public static final Block MOSSY_END_STONE_CRACKED_BRICKS     = reg("mossy_end_stone_cracked_bricks",     Blocks.MOSSY_STONE_BRICKS, 3.0f, 9.0f);
    public static final Block MOSSY_PRISMARINE_CRACKED_BRICKS    = reg("mossy_prismarine_cracked_bricks",    Blocks.MOSSY_STONE_BRICKS, 1.5f, 6.0f);
    public static final Block MOSSY_RED_SANDSTONE_CRACKED_BRICKS = reg("mossy_red_sandstone_cracked_bricks", Blocks.MOSSY_STONE_BRICKS, 0.8f, 0.8f);
    public static final Block MOSSY_DRIPSTONE_CRACKED_BRICKS     = reg("mossy_dripstone_cracked_bricks",     Blocks.MOSSY_STONE_BRICKS, 1.5f, 1.5f);

    private static Block reg(String name, Block base, float hardness, float resistance) {
    Identifier id = Identifier.of("stonepack", name);

    RegistryKey<Block> blockKey = RegistryKey.of(RegistryKeys.BLOCK, id);
    RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, id);

    Block block = new SimplePolymerBlock(
        AbstractBlock.Settings.copy(base)
            .registryKey(blockKey)
            .strength(hardness, resistance),
        base
    );

    Registry.register(Registries.BLOCK, id, block);
    Registry.register(
        Registries.ITEM,
        id,
        new StonepackPolymerBlockItem(
            block,
            new Item.Settings()
                .registryKey(itemKey)
                .useBlockPrefixedTranslationKey()
        )
    );

    return block;
}

    public static void initialize() {}
}
