package io.github.Tuor;

	import org.bukkit.plugin.java.*;
	import org.bukkit.command.*;
import org.bukkit.entity.Player;

	public class Plugin extends JavaPlugin{
	 
	    @Override
	    public void onEnable() {
	    	
	    	getLogger().info("First Plug In Init");
	     
	    }
	   
	    @Override
	    public void onDisable() {
	    	
	    }
	    
	    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
	    	if(cmd.getName().equalsIgnoreCase("Kill")){
	    		Player player = (Player) sender;
	    		player.setHealth(0.0);
	    		
	    		return true;
	    	}
	    	return false;
	    }
	}