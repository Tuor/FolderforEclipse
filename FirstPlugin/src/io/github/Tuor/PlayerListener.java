package io.github.Tuor;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.event.player.*;


public class PlayerListener implements Listener{

	public PlayerListener(Plugin plugin) {
	       plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void blank(FoodLevelChangeEvent event){
		Player player = event.getPlayer();
		if(event.isBlockInHand() ==  true){
			player.openInventory(player.getInventory());
		}
	}
}
