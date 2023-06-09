package com.rakuten.ems.DateTime;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylist8 {
		  public static void main(String[] args) {
		    ArrayList<String> products = new ArrayList<>();
		    Scanner s = new Scanner(System.in);
		    System.out.println("How many products need to added");
		    int count = s.nextInt();
		    for(int i=1;i<=count;i++) {
		    	System.out.println("enter the product id");
		    	int pid= s.nextInt();
		    	System.out.println("enter the name of the product");
		    	String pname =s.next();
		    	System.out.println("enetr the cost of the number");
		    	double pcost = s.nextDouble();
		    	System.out.println("enter the quantity od the products");
		    	int quantity = s.nextInt();
		    	
		    }
		    
		    
		  }
		}



