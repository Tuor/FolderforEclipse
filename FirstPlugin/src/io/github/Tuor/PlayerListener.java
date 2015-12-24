package io.github.Tuor;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerListener implements Listener{
	
	
	public PlayerListener(Plugin plugin) {
	       plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void blank(PlayerJoinEvent event){
		Player player = event.getPlayer();
		
		.put(player.getPlayerListName(), player);
	}
}
