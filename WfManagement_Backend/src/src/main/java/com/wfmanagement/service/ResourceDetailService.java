package com.wfmanagement.service;

import java.util.List;
import com.wfmanagement.models.ResourceDetail;

public interface ResourceDetailService {

	public boolean addResource(ResourceDetail rdObj);
	public List <ResourceDetail> getAllResourceDetail();
	public ResourceDetail getResourceById(int rId);
}
