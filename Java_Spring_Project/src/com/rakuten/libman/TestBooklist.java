package com.rakuten.libman;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBooklist{

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("BooklistContext.xml");
		BookMap dept = (BookMap)context.getBean("mapbookbean");
		dept.displayBook();

	}

}






