package io.github.Tuor;


import java.util.ArrayList;

//import java.util.HashMap;

import org.bukkit.entity.Player;

public class PlayerList {
	
	//HashMap playerList = new HashMap();
	ArrayList<Player> playerList = new ArrayList<Player>();
	
	public void addPlayer(Player player){
		playerList.add(player);
	}
	
	public String getPlayerList(){
		String list = "";
		for(int i = 0; i < playerList.size(); i++){
			list += playerList.get(i).toString();
		}
		return list;
	}
}
