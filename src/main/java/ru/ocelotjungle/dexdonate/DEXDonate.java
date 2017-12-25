package ru.ocelotjungle.dexdonate;

import org.bukkit.plugin.java.JavaPlugin;

public class DEXDonate extends JavaPlugin {
	private static DEXDonate instance;
	
	public DEXDonate() {
		instance = this;
	}
	
	public static DEXDonate getInstance() {
		return instance;
	}
	
	@Override
	public void onEnable() {
		
	}
	
	@Override
	public void onDisable() {
		
	}

}
