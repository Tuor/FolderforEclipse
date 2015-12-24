package io.github.Tuor;

import java.util.Collection;
import java.util.HashMap;

import org.bukkit.entity.Player;

public class PlayerList {
	
	HashMap playerList = new HashMap();
	
	public void addPlayer(Player player){
		playerList.put(player.getName(), player)
	}
	
	public Collection getPlayerList(){
		Collection list = playerList.values();
		/*
		for(int i = 0; i < playerList.size(); i++){
			list += playerList
		}
		*/
		return list;
	}
}
