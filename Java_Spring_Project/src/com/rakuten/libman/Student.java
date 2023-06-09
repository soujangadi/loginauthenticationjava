package com.rakuten.libman;

public class Student {
	 private int id;  
	 private String name;  
	 private Address address;  
	  
	public Student(int id, String name,Address address) {  
	    this.id = id;  
	    this.name = name;  
	    this.address=address;  
	}  
	  
	public void studentdetails() {
		System.out.println("Id\t\t|Name\t\tcity\t\tState\t\tCountry");
			System.out.println(this.id+"\t\t"+this.name+"\t\t"+this.address.city+"\t\t"+this.address.state+"\t\t"+this.address.country);
			
		}


	}
	 


