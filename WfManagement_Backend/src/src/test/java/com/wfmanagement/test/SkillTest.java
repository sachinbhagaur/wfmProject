package com.wfmanagement.test;

import java.util.List;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.wfmanagement.utility.DBConfig;
import com.wfmanagement.daos.SkillsDao;
import com.wfmanagement.models.Skill;

public class SkillTest {

	private static SkillsDao skillsDaoObj;
	@BeforeClass
	public static void init(){
		
		System.out.println("init starts here");
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DBConfig.class);
		
		skillsDaoObj=context.getBean(SkillsDao.class,"SkillsDao");
	
    }
	
	@Test
	public void getAllSkillsTest(){
		
		List<Skill> sList=skillsDaoObj.getAllSkill();
		for(Skill sObj:sList) {
			System.out.println(sObj);
		}
		Assert.assertNotSame("No Skill Exist...", sList.size(), 0);
	
   }
}
