package net.gigaclub.lobbysystem;

import net.gigaclub.lobbysystem.commands.WarpCommand;
import net.gigaclub.lobbysystem.events.BlockBreakingEvent;
import net.gigaclub.lobbysystem.events.BlockPlacingEvent;
import net.gigaclub.lobbysystem.events.EntitySpawnEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        // warp item
        // grief prevention functionality
        // item drop prevention
        // item pickup prevention
        //registerCommands();
        registerEvents();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    private void registerCommands() {
        Objects.requireNonNull(getCommand("warp")).setExecutor(new WarpCommand());
    }

    private void registerEvents() {
        getServer().getPluginManager().registerEvents(new BlockBreakingEvent(), this);
        getServer().getPluginManager().registerEvents(new BlockPlacingEvent(), this);
        getServer().getPluginManager().registerEvents(new EntitySpawnEvent(), this);
    }

}
