package io.github.Tuor;

import java.util.HashMap;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerListener implements Listener{
	
	
	public PlayerListener(Plugin plugin,PlayerList pl) {
	       plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void blank(PlayerJoinEvent event){
		Player player = event.getPlayer();
		pl.add
		.put(player.getPlayerListName(), player);
	}
}
