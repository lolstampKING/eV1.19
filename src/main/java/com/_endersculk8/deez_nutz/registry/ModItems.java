package com._endersculk8.deez_nutz.registry;

import com._endersculk8.deez_nutz.deez_nutz;
import com._endersculk8.deez_nutz.items.UltimateDieItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    //Items
    public static final Item DIE = new Item(new Item.Settings().group(deez_nutz.ITEM_GROUP));
    public static final UltimateDieItem ULTIMATE_DIE_ITEM = new UltimateDieItem();
    //Block items
    public static final BlockItem DIE_BLOCK = new BlockItem(ModBlocks.DIE_BLOCK, new Item.Settings().group(deez_nutz.ITEM_GROUP));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(deez_nutz.MOD_ID, "die"), DIE);
        Registry.register(Registry.ITEM, new Identifier(deez_nutz.MOD_ID, "die_block"), DIE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(deez_nutz.MOD_ID, "ultimate_die_item"), ULTIMATE_DIE_ITEM);
    }
}
