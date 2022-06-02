package me.hiencao.skyblockcross;

import me.hiencao.skyblockcross.config.ConfigLoader;
import me.hiencao.skyblockcross.config.ConfigManager;
import net.md_5.bungee.api.plugin.Plugin;

import java.util.Objects;

public final class SkyblockCross extends Plugin {

    private static SkyblockCross instance;

    public static SkyblockCross getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;
        ConfigManager.loadConfig();
        ConfigLoader.loadSettings(Objects.requireNonNull(ConfigManager.getConfig()));
        getLogger().info("Host" + ConfigLoader.redisHost);
        getLogger().info("port" + ConfigLoader.redisPort);
        getLogger().info("pass" + ConfigLoader.redisPassword);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
