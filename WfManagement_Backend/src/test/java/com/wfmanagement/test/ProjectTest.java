package com.wfmanagement.test;

import java.util.List;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.wfmanagement.utility.DBConfig;
import com.wfmanagement.daos.ProjectsDao;
import com.wfmanagement.models.Project;


public class ProjectTest {

	private static ProjectsDao projectsDaoObj;
	@BeforeClass
	public static void init(){
		System.out.println("init starts here");
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DBConfig.class);
		
   	 	projectsDaoObj=context.getBean(ProjectsDao.class,"projectsDao");
}	
	@Test
	@Ignore
	public void getProductByIdTest(){
		
		List<Project> pList=projectsDaoObj.getAllProject();
		for(Project p:pList) {
			System.out.println(p);
		}
		Assert.assertNotSame("No project Exist...", pList.size(), 0);
	
	
   }
}
