import java.util.ArrayList;
import java.util.Collections;

public class sortingonnumber implements Comparable<sortingonnumber>{
	int rollno;
	String name;
	int age;
	
 public sortingonnumber(int rollno,String name,int age) {
	 this.rollno = rollno;
	 this.name=name;
	 this.age=age;
	 
 }
 @Override
 public int compareTo(sortingonnumber o) {
	 if(this.age==o.age) {
		 return 0;
	 }
	 else if(this.age>o.age){
		 return 1;
	 }
	 else {
		 return-1;
	 }
 }
	public static void main(String[] args) {
		ArrayList<sortingonnumber> al=new ArrayList<sortingonnumber>();
		al.add(new sortingonnumber(1001,"Muthu",38));
		al.add(new sortingonnumber(1001,"Muthu",25));
		al.add(new sortingonnumber(1001,"Muthu",26));
		al.add(new sortingonnumber(1001,"Muthu",88));
		al.add(new sortingonnumber(1001,"Muthu",12));
		Collections.sort(al);
		
		
		for(sortingonnumber s : al) {
			System.out.println(s.rollno+" "+s.name+" "+s.age);
		}
	

	}

}
