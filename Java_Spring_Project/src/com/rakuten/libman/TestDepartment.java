package com.rakuten.libman;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDepartment{

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("DepartmentContext.xml");
		Department dept = (Department)context.getBean("deptbean");
		dept.displayRecords();

	}

}




