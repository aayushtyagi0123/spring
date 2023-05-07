package com.spring.springjdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.springjdbc.entities.Student;

public class studentdaoImpl implements studentDao{

	private JdbcTemplate jdbcTemplate;

	public int insert(Student student) {
		// TODO Auto-generated method stub
		
		String query="insert into student(id,name,city) values(?,?,?)";
		
		int r=this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return r;
		
	}
	
	public int delete(Student student)
	{
		String query="delete from student s where s.id=?";
		int r=this.jdbcTemplate.update(query,student.getId());
		return r;
	}
	
	public Student getStudent(int studentId) {
		String query="select * from student where id=?";
		  RowMapper<Student> rowmapper=new RowMapperImpl(); 
		Student s=this.jdbcTemplate.queryForObject(query,rowmapper,studentId);
		return s;
	}
	
	public List<Student> getallStudent() {
	 String query="select * from student";
	 RowMapper<Student> rowmapper=new RowMapperImpl();
	 List<Student> student=this.jdbcTemplate.query(query, rowmapper);
	 
		return student;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	

	
	
}
