package com.wfmanagement.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wfmanagement.daos.ResourceDetailsDao;
import com.wfmanagement.models.ResourceDetail;
import com.wfmanagement.service.ResourceDetailService;

@Service("ResourceDetailServiceImpl")
public class ResourceDetailServiceImpl implements ResourceDetailService {

	private static final String Password = null;
	@Autowired
	ResourceDetailsDao resourcedetailsDao;
	
	public boolean addResource(ResourceDetail rdObj) {

		return false;
	}

	public List<ResourceDetail> getAllResourceDetail() {

		return null;
	}

	public ResourceDetail getResourceById(int rId) {

		return null;
	}

	public   ResourceDetail loginValidation(int username, String pass) {
		
	   return resourcedetailsDao.loginValidation(username, pass);
		
	}

}
