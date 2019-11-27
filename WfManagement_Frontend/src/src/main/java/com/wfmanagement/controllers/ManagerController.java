package com.wfmanagement.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.wfmanagement.models.ResourceDetail;
import com.wfmanagement.serviceimpl.ManagerService;

@Controller
public class ManagerController {
	
	@Autowired
	ManagerService managerService;
	
	@Autowired
	HttpSession session;
	
	@RequestMapping(value="/getRaiseResourceRequest", method=RequestMethod.GET)
	public String getRaiseResourceRequest(ModelMap map) { 
		
		ResourceDetail resourceObj=(ResourceDetail)session.getAttribute("rdObj");
		if(resourceObj != null) {
			System.out.println("Project Name : "+resourceObj.getResourceProjectObj().getProjectName());
			map.addAttribute("projectName",resourceObj.getResourceProjectObj().getProjectName());
		} else {
			map.addAttribute("projectName","None");
		}
		return "RaiseResourceRequestPage";
	}
	
	
	@RequestMapping(value="/raiseResourceRequest", method=RequestMethod.POST)
	public String raiseResourceRequest(@RequestParam String projectName, @RequestParam String projectStartDate, 
			@RequestParam String projectEndDate, @RequestParam String role, @RequestParam String experience, @RequestParam String remarks, @RequestParam String skill) { 
		
		System.out.println(projectName+" "+projectStartDate+" "+projectEndDate+" "+role+" "+experience+" "+remarks+" "+skill);
		
		managerService.raiseResourceRequest(projectName, projectStartDate, projectEndDate, role, experience, remarks, skill);
		
		return "Success";
	}
}
