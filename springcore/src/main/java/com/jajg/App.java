package com.jajg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jajg.dao.EmployeeDao;
import com.jajg.entity.Employee;
import com.jajg.ormdao.StudentOrmDao;
import com.jajg.ormentity.OrmStudent;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {	//ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
    	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    	OrmStudent stud=new OrmStudent("JAJG","FSD");
    	StudentOrmDao dao=new StudentOrmDao();
    	System.out.println("inserted"+dao.insert(stud)+"row");
    	
    	
//    	EmployeeDao empDao=context.getBean("emp", EmployeeDao.class);
//    	Employee emp=new Employee(1, "JAJG", "Bangalore");
//    	empDao.insert(emp);
    	//Student s1=context.getBean("student1", Student.class);
      //  System.out.println( s1 );
    }
}
