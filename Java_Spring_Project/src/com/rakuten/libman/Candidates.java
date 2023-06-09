package com.rakuten.libman;

public class Candidates {
	private int id;
	String name;
	public Candidates() {
		System.out.println("Empty Constructors");
		
	}
	public Candidates(int id) {
		this.id =id;
	}
	public Candidates(String name) {
		this.name = name;
				
	}
	public Candidates(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public void displayDetails() {
		System.out.println("ID\t\t|Name");
		System.out.println(this.id +"\t\t"+this.name);
				
	}

}
