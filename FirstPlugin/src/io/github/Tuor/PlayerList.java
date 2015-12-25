package io.github.Tuor;

/*import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;*/
import java.util.ArrayList;
import java.util.HashMap;

import org.bukkit.entity.Player;

public class PlayerList {

	HashMap<String, Player> playerMap = new HashMap<String, Player>();
	ArrayList<String> playerList = new ArrayList<String>();
	
	public void addPlayer(Player player){
		playerMap.put(player.getName(), player);
		playerList.add(player.getName());
	}
	
	public void removePlayer(Player player){
		playerMap.remove(player.getName());
		playerList.remove(player.getName());
	}
	
	public String getPlayerList(){
		String list = "";
		for (String name: playerMap.keySet()){
            list += name;  
		} 
		return list;
	}
	
	public String getServerPlayerList(){
		String list = "";
		for (String p : playerList){
			list += p + ", ";
		}
		return list;
	}
	
	public boolean checkPlayer(Player player){
		if(playerMap.containsKey(player.getName())){
			return true;
		}else{
			return false;	
		}
	}
	
	/*public void saveList(){
		File file = //your file
		try{
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			for(String p:hashmap.keySet()){
				bw.write(p + "," + hashmap.get(p));
				bw.newLine();
			}
			bw.flush();
			bw.close();
		}
	}
	*/
}
