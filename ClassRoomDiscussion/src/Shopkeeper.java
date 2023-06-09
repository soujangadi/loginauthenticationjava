
public class Shopkeeper {
 Mobile gives (Money  m)
 {
 return new Mobile();
 }
	public static void main(String[] args) {
		Shopkeeper s = new Shopkeeper();
		Mobile m = new Mobile();
		Money p = new Money();
		s.gives(p,m);
	}
		
public class Money{}
public class Mobile{}