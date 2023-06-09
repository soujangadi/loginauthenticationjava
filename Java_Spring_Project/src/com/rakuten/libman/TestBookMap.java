package com.rakuten.libman;


	import org.springframework.context.ApplicationContext;


	import org.springframework.context.support.ClassPathXmlApplicationContext;

	public class TestBookMap {
		public static void main(String[] args) {
			ApplicationContext context = new ClassPathXmlApplicationContext("BooklistContext.xml");
			BookMap Book = (BookMap)context.getBean("mapbookbean");
			Book.displayBook();		
		}


		}


