package io.github.Tuor;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerListener implements Listener{
	
	PlayerList playerList;
	public PlayerListener(Plugin plugin,PlayerList pl) {
	       plugin.getServer().getPluginManager().registerEvents(this, plugin);
	       this.playerList = pl;
	}
	
	@EventHandler
	public void blank(PlayerJoinEvent event){
		Player player = event.getPlayer();
		playerList.addPlayer(player);
	}
}
