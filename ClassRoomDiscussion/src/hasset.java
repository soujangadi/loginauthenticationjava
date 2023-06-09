import java.util.HashSet;
import java.util.Iterator;

public class hasset {

	public static void main(String[] args) {
		HashSet<String> hs =new HashSet<String>();
		hs.add("hitlerman");
		hs.add("motherinlaw");
		hs.add("kohli");
		hs.add("ganguly");
		hs.add("himan");
		hs.add("dhoni");
		System.out.println(hs);
		System.out.println(hs.contains("dhoni"));
		//for each loop
		for(String s:hs) {
			System.out.println(s);
		}
		Iterator <String> itr= hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		

	}

}
