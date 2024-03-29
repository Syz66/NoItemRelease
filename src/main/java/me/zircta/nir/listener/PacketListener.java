package me.zircta.nir.listener;

import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemBow;
import net.minecraft.network.play.client.C07PacketPlayerDigging;
import net.weavemc.loader.api.event.PacketEvent;
import net.weavemc.loader.api.event.SubscribeEvent;

public class PacketListener {
    @SubscribeEvent
    public void onPacket(PacketEvent ev) {
        if (ev.getPacket() instanceof C07PacketPlayerDigging c07) {
            if (c07.status == C07PacketPlayerDigging.Action.RELEASE_USE_ITEM) {
                if (!(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() instanceof ItemBow)) {
                    ev.setCancelled(true);
                }
            }
        }
    }
}
