package com.spring.orm.springorm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_details")
public class student {

	@Id
	@Column(name="student_id")
	int studentid;
	
	@Column(name="student_name")
	String studentName;
	
	@Column(name="student_city")
	String studentCity;

	@Override
	public String toString() {
		return "student [studentid=" + studentid + ", studentName=" + studentName + ", studentCity=" + studentCity
				+ "]";
	}

	public student(int studentid, String studentName, String studentCity) {
		super();
		this.studentid = studentid;
		this.studentName = studentName;
		this.studentCity = studentCity;
	}

	public student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentCity() {
		return studentCity;
	}

	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
	
	
	
}
