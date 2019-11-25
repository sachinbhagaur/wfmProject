package com.wfmanagement.daosimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wfmanagement.daos.SkillsDao;
import com.wfmanagement.models.Skill;

@Repository("skills")
@Transactional
public class SkillDaoImpl implements SkillsDao {

	@Autowired
	private SessionFactory sessionFactory;
       
	public List<Skill> getAllSkill() {
		
		try {
            Session session=sessionFactory.getCurrentSession();
            Query query=session.createQuery("from com.wfmanagement.models.Skill");
            return query.list();
            }
            catch(Exception e){
                  e.printStackTrace();
            }
            
     return null;
}
}
