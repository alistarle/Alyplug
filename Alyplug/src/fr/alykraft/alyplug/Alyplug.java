package fr.alykraft.alyplug;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

public class Alyplug extends JavaPlugin{
	
	Logger log;
	
	@Override
	public void onEnable(){
		log.info("Chargement de Alyplug...");
		log.info("Alyplug chargé");
	}
	
	@Override
	public void onDisable(){
		//Action à effectuer à la désactivation du plugin
	}
	
}
