package net.gigaclub.lobbysystem.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class EntitySpawnEvent implements Listener {

    @EventHandler
    public void onEntitySpawn(CreatureSpawnEvent event) {
        // cancel mob spawning
        event.setCancelled(true);
    }

}
