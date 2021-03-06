package io.github.Tuor;

	import org.bukkit.command.Command;
	import org.bukkit.command.CommandSender;
	import org.bukkit.entity.Player;
	import org.bukkit.event.Listener;
	import org.bukkit.plugin.java.JavaPlugin;

	public class Plugin extends JavaPlugin implements Listener{
		
		PlayerList playerList;
		
	    @Override
	    public void onEnable() {
	    	/*Init=================================
	    	Check if there is any player list stored on server
	    	TODO
	    	If not
	    	create new Player list
	    	*/
	    	playerList = new PlayerList();
	    	
	    	getLogger().info("================================================\n"+"+++First PlugIn Init+++\n"+"================================================");
	    	
	    	new PlayerListener(this, playerList);
	    }
	    
	    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
	    	//====================================================================================================
	    	//Kill Command
	    	if(cmd.getName().equalsIgnoreCase("Kill1")){
	    		if(sender instanceof Player){
	    			Player player = (Player) sender;
	    			player.setHealth(0.0);
	    			return true;
	    		}else{
	    			return false;
	    		}
	    	}
	    	//====================================================================================================
	    	//====================================================================================================
	    	//Build Command
	    	/*if(cmd.getName().equalsIgnoreCase("Build")){
	    		if(sender instanceof Player){
	    			Player player = (Player) sender;
	    			player.getEyeLocation();
	    			return true;
	    		}else{
	    			return false;
	    		}
	    	}
	    	*/
	    	//====================================================================================================
	    	//====================================================================================================
	    	//PlayerList Command
	    	if(cmd.getName().equalsIgnoreCase("getPlayerList")){
	    		getLogger().info(playerList.getPlayerList());
	    		return true;
	    	}
	    	//====================================================================================================
	    	return false;
	    }
	    
	    @Override
	    public void onDisable() {
	    	playerList.saveList();
	    	/*
	    	Load the player list and other information onto file on server
	    	TODO
	    	*/
	    }
	}
