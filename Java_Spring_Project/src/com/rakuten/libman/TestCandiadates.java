package com.rakuten.libman;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCandiadates {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("candidateContext.xml");
		Candidates emp = (Candidates) context.getBean("Candidatesbean");
		emp.displayDetails();

	}

}




