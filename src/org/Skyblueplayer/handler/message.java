package org.Skyblueplayer.handler;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class message {
    public void consolelog(String Message) {
        Bukkit.getConsoleSender().sendMessage(Message);
    }

    public void playermessage(Player player, String Message) {
        player.sendMessage(Message);
    }
}
