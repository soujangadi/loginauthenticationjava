package com.rakuten.ems.DateTime;

public class testemployes<T> {
	testemployes(T value){
		System.out.println(value);
	}

	public static void main(String[] args) {
		genericsemployee e= new genericsemployee("souj" ,123, "ele");
		testemployes<genericsemployee> d = new testemployes<genericsemployee>(e);
		
		
		

	}

}
