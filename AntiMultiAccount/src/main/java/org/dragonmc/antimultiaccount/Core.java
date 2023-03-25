package org.dragonmc.antimultiaccount;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.HashMap;

public class Core implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        String playerIP = player.getAddress().getAddress().getHostAddress().split(":")[0];

        for (Player onlinePlayer : Bukkit.getOnlinePlayers()) {
            String onlinePlayerIP = onlinePlayer.getAddress().getAddress().getHostAddress().split(":")[0];

            if (playerIP.equals(onlinePlayerIP) && !player.equals(onlinePlayer)) {
                player.kickPlayer("Multi-accounting is not §callowed §ron this server.");
            }
        }
    }



}
