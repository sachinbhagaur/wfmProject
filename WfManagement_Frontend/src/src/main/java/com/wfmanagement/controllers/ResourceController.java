package com.wfmanagement.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.wfmanagement.daos.ResourceDetailsDao;
import com.wfmanagement.daos.ResourceRoleDao;
import com.wfmanagement.daos.SkillsDao;
import com.wfmanagement.models.ResourceDetail;

@Controller
public class ResourceController {
	

	@Autowired
	ResourceDetailsDao resourceDetailDaoImpl;
	
	@Autowired
	SkillsDao skillsDao;
	
	@Autowired
	ResourceRoleDao resourceRoleDao;
	
	@RequestMapping(value="/addResourceForm",method=RequestMethod.GET)
	public ModelAndView getResourceForm(){
		ModelAndView mv=new ModelAndView("AddResource");
		mv.addObject("resourceObj",new ResourceDetail());
		mv.addObject("skillsObj",skillsDao.getAllSkill());
		mv.addObject("rolesObj",resourceRoleDao.getAllRole());
		return mv;
	}
	
	@RequestMapping(value="/addResource",method=RequestMethod.POST)
	public ModelAndView addResource(@ModelAttribute("resourceObj")ResourceDetail resourceObj){
		resourceDetailDaoImpl.addResource(resourceObj);
		
		ModelAndView mv=new ModelAndView("ViewAllResource");
		mv.addObject("resources",resourceDetailDaoImpl.getAllResourceDetail());
		return mv;
	}
	
	
	
	@RequestMapping(value="/viewAllResource",method=RequestMethod.GET)
	public ModelAndView getAllResourceDetail(){
	
		List<ResourceDetail> resources=resourceDetailDaoImpl.getAllResourceDetail();
		ModelAndView mv=new ModelAndView("ViewAllResource");
		mv.addObject("resources",resources);
		return mv;
	}
	
}
