package com.artemssa;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;

public class HelloPlugin extends JavaPlugin {

    private BukkitTask helloTask;

    @Override
    public void onEnable() {
        getLogger().info("HelloPlugin включен! Начинаю писать привет...");
        
        // Запускаем задачу каждую секунду (20 тиков = 1 секунда)
        helloTask = Bukkit.getScheduler().runTaskTimer(this, () -> {
            for (Player player : Bukkit.getOnlinePlayers()) {
                player.sendMessage("§a[HelloPlugin] Привет, " + player.getName() + "!");
            }
        }, 0L, 20L); // 0L = сразу, 20L = каждые 20 тиков (1 секунда)
    }

    @Override
    public void onDisable() {
        if (helloTask != null) {
            helloTask.cancel();
        }
        getLogger().info("HelloPlugin выключен.");
    }
}