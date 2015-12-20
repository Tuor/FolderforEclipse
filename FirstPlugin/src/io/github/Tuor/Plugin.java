package io.github.Tuor;

	import org.bukkit.plugin.java.*;
	import org.bukkit.command.*;
	import org.bukkit.entity.Player;
	import org.bukkit.event.EventHandler;
	import org.bukkit.event.Listener;
	import org.bukkit.event.player.PlayerInteractEvent;

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
	    		Player player = (Player) sender;
	    		player.setHealth(0.0);
	    		return true;
	    	}
	    	return false;
	    }
	    
	    @EventHandler
	    public void onInteract(PlayerInteractEvent event){
	    	
	    }
	    	
	    
	}
