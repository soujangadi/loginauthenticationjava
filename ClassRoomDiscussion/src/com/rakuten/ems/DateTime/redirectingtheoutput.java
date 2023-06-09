package com.rakuten.ems.DateTime;
import java.io.File;
import java.io.PrintStream;

public class redirectingtheoutput {

	public static void main(String[] args)throws Exception {
		PrintStream file = new PrintStream (new File("/Users/ts-soujanya.angadi/Documents/souji.txt"));
		PrintStream console =System.out;
		System.setOut(file);
		System.out.println("WELCOME TO BANGALORE");
		System.setOut(console);
		System.out.println("WELCOME TO INDIA");


	

	}

}
