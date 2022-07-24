package com._endersculk8.deez_nutz.registry;

import com._endersculk8.deez_nutz.deez_nutz;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block DIE_BLOCK = new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).strength(5.0f, 30.0f).sounds(BlockSoundGroup.METAL));

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(deez_nutz.MOD_ID, "die_block"), DIE_BLOCK);
    }

}
