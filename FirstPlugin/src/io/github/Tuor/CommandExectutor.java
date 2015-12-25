package io.github.Tuor;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandExectutor implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender arg0, Command arg1, String arg2, String[] arg3) {
		//TODO PLAYERLIST -ADMIN,OP,PLAYER,SERVER
			//GIVES A LIST OF PLAYERS CURRENTLY ONLINE + MAYBE INFORMATION
		//TODO PLAYERSERVERLIST -ADMIN,OP, SERVER
			//GIVES A LIST OF EVERYPLAYE RTHAT HAS BEEN ON THE SERVER
		//TODO CREATEFACTION -ADMIN,OP, PLAYER
			//CREATES A FACTION
		//TODO DISBAND FACTION -ADMIN,OP
		//==FACTION COMMANDS -FACTION OWNER==
			//TODO MAKE SURE THE OWNER CAN ONLY CHANGE THEIR FACTION
			//TODO INVITE PLAYER
			//TODO DISBAND FACTION
			//TODO ADD DISCRIPTION
			//TODO REMOVE PLAYER
			//TODO MAKE ADMIN
			//TODO REMOVE PLAYER
		//TODO PLAYER REMOVE - ADMIN,SERVER
		return false;
	}

}
