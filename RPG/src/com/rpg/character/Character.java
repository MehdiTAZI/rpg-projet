package com.rpg.Character;

import java.util.List;

import com.rpg.Character.invontory.Invontory;
import com.rpg.equipable.IEquipable;
import com.rpg.skills.ISkill;

public abstract class Character implements ICharacter{
	
	private String name;
	
	private Integer level;
	
	private Integer currentHP;
	private Integer currentSP;
	
	private List<ISkill> skills;
	private Invontory invontory;
	private Equipement equipement;
	private Stats stats;
	
}
