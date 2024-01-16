package me.zircta.nir;

import me.zircta.nir.listener.PacketListener;
import net.weavemc.loader.api.ModInitializer;
import net.weavemc.loader.api.event.EventBus;

public class Main implements ModInitializer {
    @Override
    public void preInit() {
        EventBus.subscribe(new PacketListener());
    }
}