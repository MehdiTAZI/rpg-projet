package com.rpg.skills;

import java.util.List;

public class Skill implements ISkill {
	private final List<ISkill> requiredSkills=null;
	private Integer level=0;
	private String name;
	@Override
	public Boolean isEnabled(List<ISkill> playerSkills) {
		
		for (ISkill skill : playerSkills) {
			//if(skill.)
		}
		
		return true;
	}

	@Override
	public Integer getLevel() {
		return this.level;
	}

	@Override
	public String getName() {
		return this.name;
	}
	
	
	public boolean equals(ISkill skill) {
		return (this.getName().equals(skill.getName()) && this.getLevel().equals(skill.getLevel()));
	}


}
