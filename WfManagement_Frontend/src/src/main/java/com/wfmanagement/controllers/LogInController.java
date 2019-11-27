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
	
	public static final String MANAGER_PAGE = "ProjectManagerPage";
	public static final String ADMIN_PAGE = "AdminPage";
	public static final String TESTER_DEV_PAGE = "TesterAndDeveloperPage";
	public static final String HOME_PAGE = "TesterAndDeveloperPage";
	
	@RequestMapping(value="/Login",method=RequestMethod.POST)
	public String loginValidation(@RequestParam int username,@RequestParam String pass){
	
		ResourceDetail resourceDetail=resourceDetailServiceImpl.loginValidation(username,pass);
		if (resourceDetail == null) {
			return HOME_PAGE;
		}
		else {
			String role =resourceDetail.getResourceRoleObj().getRoleType();
			System.out.println("role : "+role);
			session.setAttribute("rdObj",resourceDetail);
			
			if(role.equalsIgnoreCase("ADMIN")) 
				return ADMIN_PAGE;
			else if(role.equalsIgnoreCase("MANAGER"))
				return MANAGER_PAGE;
			else if(role.equalsIgnoreCase("DEVELOPER")||role.equalsIgnoreCase("SENIOR-DEVELOPER")||role.equalsIgnoreCase("TESTER")||role.equalsIgnoreCase("SENIOR-TESTER"))
				return TESTER_DEV_PAGE;
			else 
				return HOME_PAGE;
			}
	   }
	}

