package com.wfmanagement.controllers;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.wfmanagement.models.ResourceDetail;
import com.wfmanagement.serviceimpl.ResourceDetailServiceImpl;

@Controller
public class LogInController {
	
	@Autowired
	HttpSession session;
	
	@Autowired
	ResourceDetailServiceImpl resourceDetailServiceImpl;
	
	@RequestMapping(value="/Login",method=RequestMethod.POST)
	public String loginValidation(@RequestParam int username,@RequestParam String pass){
	
	
		ResourceDetail rdObj=resourceDetailServiceImpl.loginValidation(username,pass);
		if(rdObj==null){
			return "HomePage";
		}
		else {
			String role=rdObj.getResourceRoleObj().getRoleType();
			System.out.println("role : "+role);
			session.setAttribute("rdObj",rdObj);
			
			if(role.equals("ADMIN")){
				return "AdminPage";
			}
			else {
				
				if(role.equals("MANAGER")){
					return "ProjectManagerPage";
			   
				  
			}
				else {
					return "TesterAndDeveloperPage";
			}
		  }
	   }
	}
  }
