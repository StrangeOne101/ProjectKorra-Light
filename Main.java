package com.Swan.Korra.ProjectKorraLight;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import com.Swan.Korra.ProjectKorraLight.LightListener;
import com.projectkorra.projectkorra.Element;
import com.projectkorra.projectkorra.ProjectKorra;
import com.projectkorra.projectkorra.ability.CoreAbility;
import com.projectkorra.projectkorra.configuration.ConfigManager;

public class Main extends JavaPlugin{
	
	public static Element Light;
	
	public void onEnable() {
		FileConfiguration config = getConfig();
		config.options().copyDefaults(true);
		ConfigManager.languageConfig.get().addDefault("Chat.Colors.Light", "YELLOW");
		ConfigManager.languageConfig.get().addDefault("Chat.Prefixes.Light", "[Light]");
		ConfigManager.languageConfig.save();
		saveConfig();
		
		Light = new Element("Light", null, this);
		
		ProjectKorra.plugin.getServer().getPluginManager().registerEvents(new LightListener(), ProjectKorra.plugin);
		CoreAbility.registerPluginAbilities(this, "com.Swan.Korra.ProjectKorraLight");
		
		Bukkit.broadcastMessage("" + Light.getColor());
		Bukkit.broadcastMessage(Light.getPrefix());
		
	}
}
