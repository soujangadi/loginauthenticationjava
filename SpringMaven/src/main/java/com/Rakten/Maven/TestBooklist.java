package com.Rakten.Maven;


	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;
	public class TestBooklist{
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("IndianjearseyContext.xml");
	Booklist emp = (Booklist)context.getBean("bookbean");
				emp.displayRecords();		
				}



}



