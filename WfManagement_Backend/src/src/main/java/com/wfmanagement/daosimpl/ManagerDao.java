package com.wfmanagement.daosimpl;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wfmanagement.models.Project;
import com.wfmanagement.models.ResourceAssignmentRequest;
import com.wfmanagement.models.Role;

/*
 * 
 */
@Repository("ManagerDao")
@Transactional
public class ManagerDao {
	
	// 
	
	@Autowired
	private SessionFactory sessionFactory;

	public boolean raiseResourceRequest(String projectName, int projectId, int roleId, Date projectStartDate, Date projectEndDate, String role, String experience, String remarks, String skill) {
		Session session=sessionFactory.getCurrentSession();
		try {
			/*ResourceAssignmentRequest resourceAssignmentRequest = new ResourceAssignmentRequest();
			Project project = new Project();
			project.setProjectId(projectId);
			project.setProjectName(projectName);
			resourceAssignmentRequest.setProject(project);
			Role rolePojo = new Role();
			rolePojo.setRoleId(roleId);
			rolePojo.setRoleType(role);
			resourceAssignmentRequest.setResourceRoleObj(rolePojo);
			resourceAssignmentRequest.setRarRequiredExprience(Integer.parseInt(experience));
			resourceAssignmentRequest.setRarSkill(skill);
			resourceAssignmentRequest.setRarStartDate(projectStartDate);
			resourceAssignmentRequest.setRarEndDate(projectEndDate);
			resourceAssignmentRequest.setRarRemarks(remarks);
			session.persist(resourceAssignmentRequest);*/
		return true;
		} catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error Occur due to "+ e.getMessage());
      }
		return false;
	}

}
