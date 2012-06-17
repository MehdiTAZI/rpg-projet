package com.rpg.Character;

import com.rpg.equipable.Equipable;
import com.rpg.skills.IMagicalSkill;
import com.rpg.skills.IPhysicalSkill;
import com.rpg.skills.ISkill;
import com.rpg.usable.Usable;
import com.rpg.utils.Interval;

public interface ICharacter {
	
	public String getClassName();
	
	//Calcul des metriques relative a l'attaque et la defence
	public Interval getAttackPower();
	public Interval getMagicAttackPower();
	
	public Integer getDefencePower();
	public Integer getMagicDefencePower();
	
	public Integer getAttackSpeed();
	public Integer getMagicSpeed();
	
	public Integer getAttackPrecision();
	public Integer getMagicAttackPrecision();
	
	//Calcul des metriques relative au point de vie et de magie
	
	public Integer getTotalHP();
	public Integer getTotalSP();
	
	public Integer getAmountHPRegeneration();
	public Integer getAmountSPRegeneration();
	
	//fonction permettons d'equiper et d'utiliser des objet
	public Boolean use(Usable consomable);
	public Boolean equip(Equipable equipable);
	
	//renvoie le nombre de degat infiltré
	public Integer attack(Character character);
	public Integer magicAttack(Character character);
	
	public Integer attack(Character character,IPhysicalSkill skill);
	public Integer magicAttack(Character character,IMagicalSkill skill);	
	
}
