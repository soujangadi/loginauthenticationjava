import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
public class Mapinterfave {

	public static void main(String[] args) {
		Map<Integer,String>jersey =new HashMap<Integer,String>();
		jersey.put(7, "DHONI");
		jersey.put(10, "MESSI");
		jersey.put(18, "RIVALDO");
		jersey.put(18, "RHONALDIHNO");
		jersey.put(20, "MARADONA");
		System.out.println("Way 1: Printing the map directly");
		System.out.println(jersey);
		System.out.println();
		System.out.println("Way 2: iterating through entrySet");
		for(Map.Entry<Integer, String> m:jersey.entrySet()) {
			System.out.println(m.getKey()+"->"+ m.getValue());
		
		}
		System.out.println();
		System.out.println("Way 3: Iterating through keyset and values");
		System.out.println("printing keys");
		for(Integer k:jersey.keySet()) {
			System.out.println("Keys ="+k);
		}
		
		System.out.println("printing values");
		for(String k:jersey.values()) {
			System.out.println("values ="+k);
		}
		
System.out.println();
System.out.println("Way 4: Iterating through Keyset and Values");
 Iterator<Map.Entry<Integer,String>> itr =jersey.entrySet().iterator();
 while(itr.hasNext()) {
	 Entry<Integer,String> e = itr.next();
	 System.out.println("Key:"+e.getKey()+"|Values:" +e.getValue());
	 
 }
System.out.println();
System.out.println("Way 5: Iterating through .forEach()");
jersey.forEach((k,v)->System.out.println("Key="+k +"value="+v));

System.out.println(jersey);
jersey.putIfAbsent(18, "kolhi");
System.out.println(jersey);


	}

}
