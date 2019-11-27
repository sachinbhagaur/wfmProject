package com.wfmanagement.service;

import java.util.List;
import com.wfmanagement.models.Project;

public interface ProjectService {
	
	public List <Project> getAllProject();

	public void addProject(Project projectObj);	
}
