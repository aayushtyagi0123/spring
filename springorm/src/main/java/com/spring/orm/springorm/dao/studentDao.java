package com.spring.orm.springorm.dao;





import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.springorm.entities.student;





public class studentDao {

	
	private HibernateTemplate hibernatetemplate;

	@Transactional
	public int insert(student s1)
	{
		int i=(Integer)this.hibernatetemplate.save(s1);
		return i;
	}
	
	//fetching a row
	public student  getStudent(int studentid)
	{
		   student studt=this.hibernatetemplate.get(student.class,studentid);
		   return studt;
	}
	
	//fetching all records
	public List<student> getAllStudent()
	{
		List<student> st=this.hibernatetemplate.loadAll(student.class);
		    return st;
	}
	
	//deleting the data
	@Transactional
	public void delete(int studentid)
	{
	       student st=this.hibernatetemplate.get(student.class, studentid);
	       this.hibernatetemplate.delete(st);
	}
	
	
	//update the table
	@Transactional
	public void update(student st)
	{ 
		this.hibernatetemplate.update(st);
		
		
	}

	public HibernateTemplate getHibernatetemplate() {
		return hibernatetemplate;
	}

	public void setHibernatetemplate(HibernateTemplate hibernatetemplate) {
		this.hibernatetemplate = hibernatetemplate;
	}

	
}
