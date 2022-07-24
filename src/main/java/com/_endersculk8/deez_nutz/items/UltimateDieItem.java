package com._endersculk8.deez_nutz.items;

import com._endersculk8.deez_nutz.deez_nutz;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;

public class UltimateDieItem extends Item {
    public UltimateDieItem() {
        super(new FabricItemSettings().group(deez_nutz.ITEM_GROUP));
    }

    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {

        //Serverside: giving/removing items
        //Clientside: rendering, particle effect, music/sound



        if ()

        return super.useOnEntity(stack, user, entity, hand);
    }
    }
}
