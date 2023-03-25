package org.dragonmc.antimultiaccount;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class AntiMultiAccount extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().info("§c§lMULTIACCOUNT &4Protection &6is enabled!");//You can Change the enable log here.
        getServer().getPluginManager().registerEvents(new Core(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getLogger().info("§c§lMULTIACCOUNT &4Protection &6is disabled!");//You can Change the disable log also.
    }
}
