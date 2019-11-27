package com.wfmanagement.daos;

import java.util.List;
import com.wfmanagement.models.ResourceDetail;

public interface ResourceDetailsDao {
	
	public boolean addResource(ResourceDetail rdObj);
	public List <ResourceDetail> getAllResourceDetail();
	public ResourceDetail loginValidation(int username ,String Password);
    public ResourceDetail getResourceById(int rId);
   
}
