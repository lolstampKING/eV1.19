package com._endersculk8.deez_nutz;

import com._endersculk8.deez_nutz.registry.ModBlocks;
import com._endersculk8.deez_nutz.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class deez_nutz implements ModInitializer {

    public static final String MOD_ID = "dn_ender8";

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "general"), () -> new ItemStack(ModItems.DIE)
    );

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
    }
}
