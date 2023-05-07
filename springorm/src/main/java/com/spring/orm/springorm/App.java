package com.spring.orm.springorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.springorm.dao.studentDao;
import com.spring.orm.springorm.entities.student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/orm/springorm/config.xml");

		studentDao studentdao = context.getBean("studentdao", studentDao.class);

		/*student s1 = new student(123, "sonam", "saharanpur");
		int r = studentdao.insert(s1);
		System.out.println("No of row inserted " + r);*/
		
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		boolean go=true;
		while(go) {
			
		
			
		System.out.println("PRESS 1 for insert student");
		System.out.println("PRESS 2 for get single student");
		System.out.println("PRESS 3 for get all student");
		System.out.println("PRESS 4 for delete student");
		System.out.println("PRESS 5 for update student");
		System.out.println("PRESS 6 for exit");
		
		try {
			int input=Integer.parseInt(br.readLine());
			switch(input)
			{
			case 1://insert data
				//taking input from user
				System.out.println("Enter student Id");
				int studentId=Integer.parseInt(br.readLine());
				System.out.println("Enter student Name");
				String studentName=br.readLine();
				System.out.println("Enter student City");
				String studentCity=br.readLine();
				student stud=new student();
				stud.setStudentid(studentId);
				stud.setStudentName(studentName);
				stud.setStudentCity(studentCity);
				int r=studentdao.insert(stud);
				System.out.println("Record inserted "+r);
				System.out.println("********************************");
				break;
				
			case 2://get single row
				System.out.println("Enter student Id");
				int studId=Integer.parseInt(br.readLine());
				
				student stud1=studentdao.getStudent(studId);
				System.out.println(stud1);
				System.out.println("*********************************");
				break;
				
			case 3://get all record
				List<student> st=studentdao.getAllStudent();
				for(student std:st)
				{
					System.out.println("studentId:"+std.getStudentid());
					System.out.println("studentName:"+std.getStudentName());
					System.out.println("studentCity:"+std.getStudentCity());
				System.out.println("----------------------------------------");	
				}
				
				break;
				
			case 4:
				//delete record
				System.out.println("Enter student Id");
				int studentId1=Integer.parseInt(br.readLine());
				     studentdao.delete(studentId1);
				  System.out.println("student deleted....");   
				break;
			case 5:
				//update record
				System.out.println("Enter old student Id");
				int studentId2=Integer.parseInt(br.readLine());
				System.out.println("Enter  student new Name");
				String studentName2=br.readLine();
				System.out.println("Enter student new City");
				String studentCity2=br.readLine();
				student s=new student();
				s.setStudentid(studentId2);
				s.setStudentName(studentName2);
				s.setStudentCity(studentCity2);
				studentdao.update(s);
				System.out.println("********************************");
				break;
			case 6://exit
		           go=false;
				
			}
		}
		catch(Exception e)
		{
			System.out.println("Invalid input,try with another one!");
			System.out.println(e.getMessage());
		}
		
		}
		System.out.println("Thank you for using an application");
	}
}
