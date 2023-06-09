package com.rakuten.ems.DateTime;
import java.io.FileNotFoundException; 
import java.io.FileInputStream;
import java.io.IOException;

public class redirectsprimetoinputofthefile {
   
		
		 public static void main(String args[]){  
			 try {
					FileInputStream fin = new FileInputStream("/Users/ts-soujanya.angadi/Documents/souji.txt");
				static void checkPrime(int n){  
						  int i,m=20,flag=0;      
						  m=n/2;    
						   for(i=1;i<=20;i++){      
						    if(n%i==0){ 
						    	fin.
						    	fin.flush();
						    	fin.close();
						     System.out.println(n+" is not prime number");      
						     flag=1;      
						     break;      
						    }      
						   }      
						   if(flag==0)  { System.out.println(n+" is prime number"); }  
						  }  
			 }
					catch (FileNotFoundException e)  {
						System.out.println("Failed due to"+ e.getMessage());
						
					}
					catch (IOException ioe) {
						System.out.println("Failed due to"+ ioe.getMessage());
				}
			 
		 
		}    
		 
}
	


