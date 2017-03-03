package com.Swan.Korra.ProjectKorraLight;

import org.bukkit.entity.Player;

import com.projectkorra.projectkorra.Element;
import com.projectkorra.projectkorra.ability.ElementalAbility;


public abstract class LightAbility extends ElementalAbility{

	public LightAbility(Player player) {
		super(player);
		// TODO Auto-generated constructor stub
	}
	
	public Element getElement() {
		// TODO Auto-generated method stub
		return Main.Light;
	
	}
	
}

