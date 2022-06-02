package me.hiencao.skyblockcross.config;

import net.md_5.bungee.config.Configuration;

public class ConfigLoader {

    // Redis settings
    public static String redisHost;
    public static int redisPort;
    public static String redisPassword;
    public static boolean redisSSL;


    public static void loadSettings(Configuration config) throws IllegalArgumentException {

        ConfigManager.saveConfig(config);

        redisHost = config.getString("redis_settings.host", "localhost");
        redisPort = config.getInt("redis_settings.port", 6379);
        redisPassword = config.getString("redis_settings.password", "");
        redisSSL = config.getBoolean("redis_settings.use_ssl", false);
    }
}
