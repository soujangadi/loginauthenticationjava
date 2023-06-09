import java.util.Comparator;
import java.util.Iterator;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Collection;


public class TestEmployee {

	public static void main(String[] args) {
		ArrayList<Employee>emplist=new ArrayList<Employee>();
		emplist.add(new Employee(10,"Jay",45));
		emplist.add(new Employee(15,"viJay",25));
		emplist.add(new Employee(16,"AJay",35));
		Collection.sort(emplist,new agecomparator());
		
		Iterator<Employee> itr=emplist.iterator();
		while(itr.hasNext()) {
			Employee e =(Employee)itr.next();
		System.out.println(e.roll_no+"|"+e.name +"|"+e.age);
		}
		Collection.sort(emplist.new NameComparator());
		while(itr_name.hasNext()) {
			Employee e =(Employee)itr_name.next();
			System.out.println(e.roll_no+"|"+e.name +"|"+e.age);
			
		}
		
	

	}

}
