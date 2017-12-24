package ru.ocelotjungle.dexdonate;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandManager implements CommandExecutor {
	private ChatColor infoColor = ChatColor.GOLD;
	private ChatColor errorColor = ChatColor.RED;

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (label.substring(0, 3).equalsIgnoreCase("dexd")) {
			if (args.length > 0) {
				switch(args[0].toLowerCase()) {
					case "help":
						sender.sendMessage(infoColor + "/" + label + " help - information about commands");
						sender.sendMessage(infoColor + "/" + label + " link - get register link");
						sender.sendMessage(infoColor + "/" + label + " register - pair your game account with your bitShare account");
						break;
					case "link":
						sender.sendMessage(infoColor + "https://openledger.io/?r=velvet83");
						break;
					case "register":
						
				}
			}
		}
		return true;
	}
	
}
