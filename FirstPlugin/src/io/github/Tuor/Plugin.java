package io.github.Tuor;

	import org.bukkit.plugin.java.*;
	import org.bukkit.command.*;
	import org.bukkit.entity.Player;
	import org.bukkit.event.Listener;


	public class Plugin extends JavaPlugin implements Listener{
	 
	    @Override
	    public void onEnable() {
	    	//Init
	    	getLogger().info("================================================\n"+"First PlugIn Init\n"+"================================================");
	    	new PlayerListener(this);
	    }
	   
	    @Override
	    public void onDisable() {
	    }
	    
	    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
	    	if(cmd.getName().equalsIgnoreCase("Kill1")){
	    		if(sender instanceof Player){
	    			Player player = (Player) sender;
	    			player.setHealth(0.0);
	    			return true;
	    		}else{
	    			return false;
	    		}
	    	}
	    	if(cmd.getName().equalsIgnoreCase("Build")){
	    		if(sender instanceof Player){
	    			Player player = (Player) sender;
	    			player.getEyeLocation();
	    			return true;
	    		}else{
	    			return false;
	    		}
	    	}
	    	return false;
	    }	
	}
