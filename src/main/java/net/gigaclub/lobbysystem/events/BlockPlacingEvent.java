package net.gigaclub.lobbysystem.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class BlockPlacingEvent implements Listener {

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        // cancel block placing
        event.setCancelled(true);
    }

}
