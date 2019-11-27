package com.wfmanagement.test;

import java.util.List;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.wfmanagement.utility.DBConfig;
import com.wfmanagement.daos.ResourceRoleDao;
import com.wfmanagement.models.Role;

public class RoleTest {
	
	private static ResourceRoleDao resourceRoleDaoObj;
	@BeforeClass
	public static void init(){
		
		System.out.println("init starts here");
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DBConfig.class);
		
		resourceRoleDaoObj=context.getBean(ResourceRoleDao.class,"ResourceRoleDao");
}	
	@Test
	public void getAllRoleTest(){
		
		List<Role> rList=resourceRoleDaoObj.getAllRole();
		for(Role rObj:rList) {
			System.out.println(rObj);
		}
		Assert.assertNotSame("No role Exist...", rList.size(), 0);
	
   }

}
