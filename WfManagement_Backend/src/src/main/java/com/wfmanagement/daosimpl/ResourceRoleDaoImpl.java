package com.wfmanagement.daosimpl;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wfmanagement.daos.ResourceRoleDao;
import com.wfmanagement.models.Project;
import com.wfmanagement.models.Role;

@Repository("resourceRole")
@Transactional
public class ResourceRoleDaoImpl implements ResourceRoleDao {
		
		@Autowired
		private SessionFactory sessionFactory;
	       
		public List<Role> getAllRole() {
	              try {
	                     Session session=sessionFactory.getCurrentSession();
	                     Query query=session.createQuery("from com.wfmanagement.models.Role");
	                     return query.list();
	                     }
	                     catch(Exception e){
	                           e.printStackTrace();
	                     }
	                     
	              return null;
	       }

		public int getRoleId(String roleName) {
			try {
		           Session session=sessionFactory.getCurrentSession();
		           Role role = session.get(Role.class, roleName);
		           if(role!=null) {
		        	   return role.getRoleId();  
		           }
				} catch(Exception e){
				         e.printStackTrace();
			   }
		        return 0;
		}
}
