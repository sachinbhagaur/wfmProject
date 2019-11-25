package com.wfmanagement.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.wfmanagement.daos.ResourceDetailsDao;
import com.wfmanagement.daos.ResourceRoleDao;
import com.wfmanagement.models.ResourceDetail;


@Controller
public class AdminController {

	@Autowired
	ResourceDetailsDao rdObj;
	
	@RequestMapping(value="/viewAllResource",method=RequestMethod.GET)
	public ModelAndView getAllUsers(){
	
		
		List<ResourceDetail> resources=rdObj.getAllResourceDetail();
		
		ModelAndView mv=new ModelAndView("ResourceList");
		mv.addObject("resourceList",resources);
		return mv;
	
  }
	
	@RequestMapping(value="/registerResource",method=RequestMethod.POST)
	public ModelAndView registerResource(@Validated @ModelAttribute("rrObj")  ResourceRole rrObj,
			BindingResult result){
		//Will write the code to insert the object into the database
		
		myValidator.validate(rrObj, result);
		
		if(result.hasErrors()){
			System.out.println("I m here..");
			ModelAndView mv=new ModelAndView("SignUpForm");
			//mv.addObject("userObj",new User());
			mv.addObject("btnLabel","Sign Up");
			mv.addObject("formLabel", "SignUp Form");	
			return mv;
		}
		else {
		rrObj.setRole("ResourceRole");
		ResourceRoleDao.registerResource(rrObj);
		
		ModelAndView mv=new ModelAndView("SignInForm");
		mv.addObject("msg","User has been registered succesfully. Now u can Login");
		return mv;
		}
	}
	
	
	
	
}