
public class Conductor1 {
	Ticket gives (Money m ) {//method
		return new Ticket();
		//object ctreation()
		
		}
		public static void main(String[] args) {
			Conductor1 c = new Conductor1();
			Money m = new Money();

			c.gives(m);	
		}

	}

	class Money{};
	class Ticket{};
	
