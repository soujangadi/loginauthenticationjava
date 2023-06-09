package com.rakuten.libman;

	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;

	public class TestProducts {

		public static void main(String[] args) {
			ApplicationContext context = new ClassPathXmlApplicationContext("ProductContext.xml");
			Products emp = (Products)context.getBean("productbean_2");
			emp.displayDetails();

		}


}
