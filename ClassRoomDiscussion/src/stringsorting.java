import java.util.Collections;
import java.util.ArrayList;
import java.util.Collections;

public class stringsorting {

	public static void main(String[] args) {
		ArrayList<String>al= new ArrayList<String>(50);
		al.add("jeayapul");
		al.add("Abhinaya");
		al.add("Manu");
		al.add("Muthu");
		al.add("Muzammil");
		System.out.println("Array list before sorting");
		System.out.println(al);
		Collections.sort(al);
		System.out.println("Array list after printing");
		System.out.println();
		System.out.println("Displaying the array list in the reverse order");
		Collections.reverse(al);
		System.out.println(al);
		ArrayList<Integer> alist = new ArrayList<Integer>();
		alist.add(45);alist.add(54);alist.add(150);alist.add(405);alist.add(15);
		System.out.println(alist);
		System.out.println("Sorting the collections.reverseOrder");
		Collections.sort(alist,Collections.reverseOrder());
		System.out.println(alist);
		
		
		
		
		

	}

}
