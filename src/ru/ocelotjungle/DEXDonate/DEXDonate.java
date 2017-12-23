package ru.ocelotjungle.DEXDonate;

import org.bukkit.plugin.java.JavaPlugin;

public class DEXDonate extends JavaPlugin {
	private static DEXDonate instance;
	
	public DEXDonate() {
		instance = this;
	}
	
	public static DEXDonate getInstance() {
		return instance;
	}

}
