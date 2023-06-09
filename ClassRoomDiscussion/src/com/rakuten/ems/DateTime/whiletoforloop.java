package com.rakuten.ems.DateTime;
import java.io.FileInputStream;

public class whiletoforloop {


//convert while to For loop


 public static void main(String args[]) throws Exception{
	   FileInputStream fin = new FileInputStream
			   ("/Users/ts-soujanya.angadi/Documents/souji.txt");
	   for(int i=0;(i=fin.read())!=-1;) {  
		   System.out.print((char)i);
		   }
	   }
}