package java.util.Comparator;

public class namecomparator implements Comparator<Object>{
	@Override
	public int comparator(Object obj_1,Object_2) {
		Employee e1=(Employee)obj_1;
		Employee e2=(Employee)obj_2;
		return e1.empname.compareTo(e2.name);
		
	}




