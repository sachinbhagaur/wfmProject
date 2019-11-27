package com.wfmanagement.serviceimpl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wfmanagement.daosimpl.ManagerDao;
import com.wfmanagement.daosimpl.ProjectsDaoImpl;
import com.wfmanagement.daosimpl.ResourceRoleDaoImpl;

@Service("ManagerService")
public class ManagerService {
	
	@Autowired
	ManagerDao managerDao;
	
	/*@Autowired
	ProjectsDaoImpl projectsDaoImpl;*/
	
	/*@Autowired
	ResourceRoleDaoImpl resourceRoleDaoImpl;*/

	public void raiseResourceRequest(String projectName, String projectStartDate, String projectEndDate, String role,
			String experience, String remarks, String skill) {
		//int projectId = projectsDaoImpl.getProjectId(projectName);
		//int roleId = resourceRoleDaoImpl.getRoleId(role);
		String pattern = "dd-mm-yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		Date startDate = null;
		Date endDate= null;
		try {
			startDate = simpleDateFormat.parse(projectStartDate);
			endDate = simpleDateFormat.parse(projectEndDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		managerDao.raiseResourceRequest(projectName, 0, 0, startDate, endDate, role, experience, remarks, skill);
	}

}
