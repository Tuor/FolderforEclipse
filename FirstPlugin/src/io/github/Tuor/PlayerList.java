package io.github.Tuor;

import java.util.HashMap;

import org.bukkit.entity.Player;

public class PlayerList {

	HashMap<String, Player> playerList = new HashMap<String, Player>();
	
	public void addPlayer(Player player){
		playerList.put(player.getName(), player);
	}
	
	public String getPlayerList(){
		String list = "";
		for (String name: playerList.keySet()){
            list += name;  
		} 
		return list;
	}
	
	public boolean checkPlayer(Player player){
		if(playerList.containsKey(player.getName())){
			return true;
		}else{
		return false;	
		}
	}
}
