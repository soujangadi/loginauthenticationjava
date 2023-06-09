package com.rakuten.libman;

public class Books {
	String name;
	Books(String name){
		this.name=name;
	}
	@Override
	public String toString() {
		return this.name;
	}

}
