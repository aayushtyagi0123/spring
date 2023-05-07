package com.spring.springjdbc.dao;

import java.util.List;

import com.spring.springjdbc.entities.Student;

public interface studentDao {

	public int insert(Student student);
	public int delete(Student student);
    public  Student getStudent(int studentId);
    public List<Student> getallStudent();
}
