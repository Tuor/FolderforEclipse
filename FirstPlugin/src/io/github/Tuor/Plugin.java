package io.github.Tuor;

	import org.bukkit.plugin.java.*;
	import org.bukkit.command.*;

	public class Plugin extends JavaPlugin{
	 
	 
	    @Override
	    public void onEnable() {
	    	getLogger().info("First Plug In Init");
	     
	    }
	   
	    @Override
	    public void onDisable() {
	    }
	    
	    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
	    	return false;
	    }
	}