package com.wfmanagement.controllers;

import org.springframework.ui.ModelMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String getHomePage(ModelMap map){
		map.addAttribute("msg", "Welcome Home");
		return "HomePage";
	}
	
	@RequestMapping(value="/getLoginPage",method=RequestMethod.GET)
	public String getLoginPage(){
		return "LoginPage";
	}
	
}
