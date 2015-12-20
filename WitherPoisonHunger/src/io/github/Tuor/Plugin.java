package io.github.Tuor;

import org.bukkit.event.listener;
import org.bukkit.plugin.java.*;
import org.bukkit.command.*;
import org.bukkit.entity.Player;

public class Plugin extends JavaPlugin implements Listener{
 
    @Override
    public void onEnable() {
    	
    	
    	
    	getLogger().info("================================================\n"
    					+ "First PlugIn Init\n"
    				   + "================================================");
    }
   
    @Override
    public void onDisable() {
    	
    }
    
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
    	
    	
    	return false;
    }
}

}
