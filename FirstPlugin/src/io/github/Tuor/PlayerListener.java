package io.github.Tuor;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerListener implements Listener{
	
	PlayerList pl;
	
	public PlayerListener(Plugin plugin,PlayerList pl) {
	       plugin.getServer().getPluginManager().registerEvents(this, plugin);
	       this.pl = pl;
	}
	
	@EventHandler
	public void blank(PlayerJoinEvent event){
		Player player = event.getPlayer();
		if(pl.checkServerList(player)){
			player.sendMessage("Welcome back to the server");
		}else{
			pl.addPlayer(player);
			player.sendMessage("Welcome to the server");
		}
	}
}