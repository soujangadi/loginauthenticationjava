package com.rakuten.ems.DateTime;

public class Test<T> {

	    // A Generic method example
	    static <T> void employeeDisplay(T element)
	    {
	        System.out.println(element.getClass().getName()
	                           + " = " + element);
	    }
	 
	    // Driver method
	    public static void main(String[] args)
	    {
	   
	        employeeDisplay(123);
	 
	      
	        employeeDisplay("soujanya");
	 
	       
	        employeeDisplay(200);
	    }
	}

