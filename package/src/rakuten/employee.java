package rakuten;

public class employee {
	String s;
	String p;
	int  q;
	double h;
 public employee(String s,String p,int q,double h) { 
  
	  this.s =s;
	  this.p =p;
	  this.q =q;
	  this.h =h;
  } 



public String toString() {
	 return ( this.s+ "<-->"+  this.p +"<--->"+   this.q+"<-->"+  this.h);
	 
 }
 public static void main(String[] args) {
	
	 System.out.print("Id ");
	 System.out.print("name ");
	 System.out.print("department ");
	 System.out.print("salary ");
	 System.out.println("-----------------");
	

		  employee e1 =new employee("sagar","mcq",12,2567);
		  System.out.print("---------------");
		  employee e2 =new employee("siren","mpq",11,4563);
		  System.out.print("-----------------");
		  System.out.println(e1);
		  System.out.println(e2);
	  }
	
}
 
