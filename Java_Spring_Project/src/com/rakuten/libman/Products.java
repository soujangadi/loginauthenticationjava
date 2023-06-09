package com.rakuten.libman;

public class Products {
	int id;
	String name;
	double price;
	boolean isAvailable;
	CompanyAdress company;
	public Products(int id,String name,double price) 
	{
		this.id= id;
		this.name=name;
		this.price=price;
		}
		
		
	
public Products(int id,String name,double price,CompanyAdress company,boolean isAvailable) {
this.id=id;
this.name= name;
this.price=price;
this.isAvailable=isAvailable;
this.company = company;

}
public void displayDetails() {
	
	System.out.println("Id\t\t|Name\t\tprice\t\tavialbility\t\tcompany");
	System.out.println(this.id+"\t\t"+this.name+"\t\t"+this.price+"\t\t\t"+this.company.location+"\t\t\t"+this.company.warehouse);
}
}
