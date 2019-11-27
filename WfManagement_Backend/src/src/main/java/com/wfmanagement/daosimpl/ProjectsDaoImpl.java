package com.wfmanagement.daosimpl;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.wfmanagement.daos.ProjectsDao;
import com.wfmanagement.models.Project;
import com.wfmanagement.models.ResourceDetail;

@Repository("projectsDao")
@Transactional
public class ProjectsDaoImpl implements ProjectsDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public List<Project> getAllProject() {
		
	              try {
	                     Session session=sessionFactory.getCurrentSession();
	                     Query query=session.createQuery("from com.wfmanagement.models.Project");
	                     return query.list();
	                     }
	                     catch(Exception e){
	                           e.printStackTrace();
	                     }
	                     
	              return null;
	}
	
	public int getProjectId(String projectName) {
		
        try {
           Session session=sessionFactory.getCurrentSession();
           Project project = session.get(Project.class, projectName);
           if(project!=null) {
        	   return project.getProjectId();  
           }
		} catch(Exception e){
		         e.printStackTrace();
	   }
        return 0;
	}
	
}
	       


