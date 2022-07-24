package com._endersculk8.deez_nutz.items;

import com._endersculk8.deez_nutz.deez_nutz;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Hand;

public class UltimateDieItem extends Item {
    public UltimateDieItem() {
        super(new FabricItemSettings().group(deez_nutz.ITEM_GROUP));
    }

    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {
        if (!user.getWorld().isClient() && hand == Hand.MAIN_HAND) {
            //Runs on serverside only
            if (entity.getType() == EntityType.SHEEP){
                //Set color to black
                SheepEntity sheep = (SheepEntity) entity;
                sheep.setColor(DyeColor.BLACK);
                if (!user.isCreative()) {
                    user.getStackInHand(hand).decrement(1);
                }
            } else {
                //If entity is not a sheep send a message in chat
                user.sendMessage(Text.literal("ERR: Entity use on is not a sheep, if this error occurred while using item on a sheep contact plugin developer or server owner. Sorry for the inconvenience ^_+"));
                return ActionResult.FAIL;
            }
        }
        return super.useOnEntity(stack, user, entity, hand);
    }
}