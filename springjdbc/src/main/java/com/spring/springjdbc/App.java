package com.spring.springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.springjdbc.dao.studentDao;
import com.spring.springjdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/springjdbc/config.xml");
        
         studentDao studentdao= context.getBean("studentDao",studentDao.class);
        /*s.setId(106);
        s.setName("soniya");
        s.setCity("SRE");
        int r=template.insert(s);
        System.out.println("no of row inserted "+r);*/
        
       /* s.setId(22);
          int r=template.delete(s);
          System.out.println(r);*/
        
       Student  student=studentdao.getStudent(106);
        System.out.println(student);
        
        List<Student> student1=studentdao.getallStudent();
        System.out.println(student1);
    }
}
