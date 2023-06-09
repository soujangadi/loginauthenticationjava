package com.rakuten.libman;
	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;
	
	public class TestEmployee {

		public static void main(String[] args) {
			ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextxml.xml");
			Employee emp = (Employee)context.getBean("employeebean");
			emp.displayName();

		}

	}

