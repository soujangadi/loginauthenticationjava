package com.rakuten.libman;


	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;
	public class Testjearsey {


		public static void main(String[] args) {
			ApplicationContext context = new ClassPathXmlApplicationContext("IndianjearseyContext.xml");
			Indianjearsey emp = (Indianjearsey)context.getBean("jearseybean");
			emp.displayTeam();

		}

	}



