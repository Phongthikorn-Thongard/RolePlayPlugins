package org.Skyblueplayer.handler;

import org.bukkit.Bukkit;

public class message {
    public void consolelog(String Message) {
        Bukkit.getConsoleSender().sendMessage(Message);
    }
}
