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

@Repository("resourceDetail")
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
	/*public ResourceDetail loginValidation(String UserName, String Password) {
		
		try {
            Session session=sessionFactory.getCurrentSession();
            ResourceDetail rObj=session.get(ResourceDetail.class , rId);
            
     
            if(rObj!=null){
                  if(rObj.getrPassward().equals(rPassward)){
                         return rObj;
                  }
               }
            }
            catch(Exception e){
                  e.printStackTrace();
            }
               return null ;
	}*/


	public ResourceDetail getResourceById(int rId) {
		// TODO Auto-generated method stub
		return null;
	}


	
	
	
}
