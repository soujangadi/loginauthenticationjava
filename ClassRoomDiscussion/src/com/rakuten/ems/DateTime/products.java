package com.rakuten.ems.DateTime;


public class products {
	
			 String  name ;
			 int  id ;
			 int quantity ;
			 int Price;

			

		public products(String name, int id, int quantity,int price) {// generate constructor
				this.name = name;
				this.id = id;
				this.quantity = quantity;
				this.Price = Price;
				
			}

			@Override
			public String toString() 
			{
				return this.name +"-" this.id  +"-" this.quantity +"-" this.Price;
			}
		public static void main(String[] args) {
			products e1= new products("vim" ,12, 201,50);
			System.out.println(e1);
			
			
		}
			


	   

	}

