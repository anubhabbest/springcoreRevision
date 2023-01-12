package com.jajg.ormdao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.jajg.ormentity.OrmStudent;

public class StudentOrmDao {
	@Autowired
	private HibernateTemplate template;
	@Transactional
	public int insert(OrmStudent student) {
		Integer i=(Integer) template.save(student);
		return i;
	}
	public HibernateTemplate getTemplate() {
		return template;
	}
	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	public StudentOrmDao() {
		
	}
	
	
}
