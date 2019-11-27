package com.wfmanagement.test;

import java.util.List;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.wfmanagement.utility.DBConfig;
import com.wfmanagement.daos.ResourceDetailsDao;
import com.wfmanagement.models.ResourceDetail;


public class ResourceDetailTest {
	
	private static ResourceDetailsDao resourceDetailsDaoObj;
	@BeforeClass
	public static void init(){
		
		System.out.println("init starts here");
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DBConfig.class);
	
		resourceDetailsDaoObj=context.getBean(ResourceDetailsDao.class,"ResourceDetailsDao");
	}
	
	@Test
	public void getAllResourceDetailByIdTest(){
		
		List<ResourceDetail> rdList=resourceDetailsDaoObj.getAllResourceDetail();
		for(ResourceDetail rdObj:rdList) {
			System.out.println(rdObj);
		}
		Assert.assertNotSame("No Resource Exist...", rdList.size(), 0);
	
   }
}
