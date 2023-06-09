
public class Softdrinks {

	public static void main(String[] args) {
		Drinakble d= new Drinakble() { 
			@Override
			public void drink(String name) {
				System.out.println("Manu drinks Soft drinks");
			}
		};
d.drink("Beer"); 
Drinakble d1=(drinks)->{
	System.out.println("Manu drinks"+drinks);
	System.out.println("Even though Manu drinks "+",he wont vomit");
  };
  d1.drink("Wine");
	
}
	}


