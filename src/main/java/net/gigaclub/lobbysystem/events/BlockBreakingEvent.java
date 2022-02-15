package net.gigaclub.lobbysystem.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BlockBreakingEvent implements Listener {

    @EventHandler
    public void onBlockBreaking(BlockBreakEvent event) {
        // cancel block breaking
        event.setCancelled(true);
    }

}
