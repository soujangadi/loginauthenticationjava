package com.rakuten.libman;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Testlibrary {


	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("LibraryContext.xml");
		Library emp = (Library)context.getBean("Librarybean");
		emp.displayBooks();

	}

}








