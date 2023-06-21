package com.rinpr.chestloot.command;

import com.rinpr.chestloot.ChestLoot;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class ChestLootCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {
        if (label.equalsIgnoreCase("ChestLoot")) {
            if (args[0].equalsIgnoreCase("reset")) {
                ChestLoot.chestManager.resetChest();
                sender.sendMessage(ChatColor.GREEN + "Chest Reset!");
            }
        }
        return true;
    }
}
