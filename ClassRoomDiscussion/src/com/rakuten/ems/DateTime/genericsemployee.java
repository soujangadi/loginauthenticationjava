package com.rakuten.ems.DateTime;

public class genericsemployee {
	 String  name ;
	 int  id ;
	 String dept ;

	

	public genericsemployee(String name, int id, String dept) {// generate constructor
		this.name = name;
		this.id = id;
		this.dept = dept;
		
	}

	@Override
	public String toString() 
	{
		return this.id + this.name  + this.dept;
	}
public static void main(String[] args) {
	genericsemployee e1= new genericsemployee("souj" ,12, "ele");
	System.out.println(e1);
	
	
}
	}


