package com.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;


import com.entities.Todo;

@Component
public class ToDoDao {

	
	JdbcTemplate jdbctemplate;
	@Autowired
	HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int save(Todo t)
	{
	Integer i=	(Integer) hibernateTemplate.save(t);
	return i;
	}
	
	public List<Todo> getAll()
	{
		List<Todo> todos=hibernateTemplate.loadAll(Todo.class);
		return todos;
	}
 
	
/*	@Transactional
	public int saveUpdate(String string)
	{
	Integer i=	(Integer) hibernateTemplate.save(string);
	return i;
	}*/
	
	@Transactional
	public void Delete(int ID)
	{
		
		
	Todo t=hibernateTemplate.get(Todo.class, ID);
            hibernateTemplate.delete(t);
	}
	
}
