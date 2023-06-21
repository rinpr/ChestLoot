package com.rinpr.chestloot;

import com.rinpr.chestloot.command.ChestLootCommand;
import com.rinpr.chestloot.event.ChestManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class ChestLoot extends JavaPlugin {

    public static ChestManager chestManager;
    @Override
    public void onEnable() {
        // Plugin startup logic
        saveDefaultConfig();

        chestManager = new ChestManager(getConfig());

        getServer().getPluginManager().registerEvents(chestManager, this);

        Objects.requireNonNull(this.getCommand("ChestLoot")).setExecutor(new ChestLootCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
