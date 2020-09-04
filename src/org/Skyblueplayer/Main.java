package org.Skyblueplayer;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("§8______________________");
        Bukkit.getConsoleSender().sendMessage("§8|§6	   RolePlay        §8|");
        Bukkit.getConsoleSender().sendMessage("§8|§6  By Skyblueplayer   §8|");
        Bukkit.getConsoleSender().sendMessage("§8______________________");
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("§8______________________");
        Bukkit.getConsoleSender().sendMessage("§8|§6	   RolePlay    8|");
        Bukkit.getConsoleSender().sendMessage("§8|§6     Shutdown    8|");
        Bukkit.getConsoleSender().sendMessage("§8______________________");
    }
}
