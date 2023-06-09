
public class createobj {
	public static void main(String[] args) {
		Muzammil m= Muzammil.getInstance();
		Muzammil k= Muzammil.getInstance();
		Muzammil.getInstance();
		Muzammil.getInstance();
		Muzammil.getInstance(m);
		Muzammil.getInstance(k);
		System.out.println("you have created"+Muzammil.nonsense+"object");
		
		
	}

}
