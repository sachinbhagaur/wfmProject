package com.wfmanagement.daosimpl;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.wfmanagement.daos.ResourceDetailsDao;
import com.wfmanagement.models.ResourceDetail;

@Repository("resourcedetail")
@Transactional
public class ResourceDetailDaoImpl implements ResourceDetailsDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public boolean addResource(ResourceDetail rdObj) {
		try {
			Session session=sessionFactory.getCurrentSession();
			session.persist(rdObj);
			return true;
			}
		catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}
	
	public List<ResourceDetail> getAllResourceDetail() {
		 try {
             Session session=sessionFactory.getCurrentSession();
             Query query=session.createQuery("from com.wfmanagement.models.ResourceDetail");
             return query.list();
             }
             catch(Exception e){
                   e.printStackTrace();
             }
             
      return null;
}
	public ResourceDetail loginValidation(int username, String Pass) {
		
		try {
            Session session=sessionFactory.getCurrentSession();
            ResourceDetail rObj=session.get(ResourceDetail.class , username);
            
     
            if(rObj!=null){
                  if(rObj.getResourcePassword().equals(Pass)){
                         return rObj;
                  }
               }
            }
            catch(Exception e){
                  e.printStackTrace();
            }
               return null ;
	}


	public ResourceDetail getResourceById(int rId) {
	
		return null;
	}
}
