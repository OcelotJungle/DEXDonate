package ru.ocelotjungle.DEXDonate;

import java.io.File;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class ConfigManager {
	private static ConfigManager instance;
	FileConfiguration config;
	
	private ConfigManager() {
		File file = new File(DEXDonate.getInstance().getDataFolder(), "config.yml");
		if (!file.exists()) { DEXDonate.getInstance().saveResource(file.getName(), false); }
		config = YamlConfiguration.loadConfiguration(file);
	}
	
	public static ConfigManager getInstance() {
		return instance == null ? new ConfigManager() : instance;
	}
}
