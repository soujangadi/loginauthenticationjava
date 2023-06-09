import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
public class hashmapkey {

	public static void main(String[] args) {
		Map<Integer,String>book =new HashMap<Integer,String>();
		book.put(1, "manasasarovara");
		book.put(2, "fiveandsix");
		book.put(3, "5am club");
		book.put(4, "secret");
		book.put(5, "ikigai");
		System.out.println("Way 1: Printing the map directly");
		System.out.println(book);
		System.out.println();
		System.out.println("Way 2: iterating through entrySet");
		for(Map.Entry<Integer, String> m:book.entrySet()) {
			System.out.println(m.getKey()+"->"+ m.getValue());
		
		}
		System.out.println();
		System.out.println("Way 3: Iterating through keyset and values");
		System.out.println("printing keys");
		for(Integer k:book.keySet()) {
			System.out.println("Keys ="+k);
		}
		
		System.out.println("printing values");
		for(String k:book.values()) {
			System.out.println("values ="+k);
		}
		
System.out.println();
System.out.println("Way 4: Iterating through Keyset and Values");
 Iterator<Map.Entry<Integer,String>> itr =book.entrySet().iterator();
 while(itr.hasNext()) {
	 Entry<Integer,String> e = itr.next();
	 System.out.println("Key:"+e.getKey()+"|Values:" +e.getValue());
	 
 }
 System.out.println();
 System.out.println("Way 5: Iterating through .forEach()");
 book.forEach((k,v)->System.out.println("Key="+k +"value="+v));

 System.out.println(book);
 book.putIfAbsent(4, "senorita");
 System.out.println(book);


	}

}
