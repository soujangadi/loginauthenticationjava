

import java.util.Comparator;

public class agecomparator implements Comparator<Object> {
	public int compare(Object obj_1,Object obj_2) {
		Employee e1=(Employee)obj_1;
		Employee e2=(Employee)obj_2;
		if(e1.age==e2.age) {
			return 0;
			}
		else if (e1.age>e2.age) {
			return 1;
			
		}
		else
		{
			return-1;
		}
		
		
	
	


	

	}

}
