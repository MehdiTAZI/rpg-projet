package com.rpg.skills;

import java.util.List;

public interface ISkill {
	public Boolean isEnabled(List<ISkill> playerSkills);
	public Integer getLevel();
	public String getName();
}
