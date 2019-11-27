package com.wfmanagement.service;

import java.util.List;

import com.wfmanagement.models.Skill;

public interface SkillsService {

	public List <Skill> getAllSkill();
	
	public void addSkill(Skill skillObj);
}
