package com.Rakten.Maven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {
public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("EmployeeContext.xml");
		Employee emp=(Employee)context.getBean("empbean");
	    emp.displayname();

}
}
