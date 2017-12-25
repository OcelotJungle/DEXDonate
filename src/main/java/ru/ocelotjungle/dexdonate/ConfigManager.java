package ru.ocelotjungle.dexdonate;

import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;

public class ConfigManager {
    private static ConfigManager instance;
    private YamlConfiguration config;

    private ConfigManager() {
        loadConfig();
    }

    public static ConfigManager getInstance() {
        if (instance == null) instance = new ConfigManager();
        return instance;
    }

    private void loadConfig() {
        File file = new File(DEXDonate.getInstance().getDataFolder(), "config.yml");
        if (!file.exists()) {
            DEXDonate.getInstance().saveResource(file.getName(), false);
        }
        config = YamlConfiguration.loadConfiguration(file);
    }

    public String getCentralAccountLogin() {
        return config.getString("CentralAccount.Login");
    }

    public String getCentralAccountPassword() {
        return config.getString("CentralAccount.Password");
    }

    public String getCentralAccountAddress() {
        return config.getString("CentralAccount.Address");
    }

    public String getExchangeAsset() {
        return config.getString("Exchange.Asset");
    }

    public long getExchangeRate() {
        return config.getLong("Exchange.Rate");
    }

}
