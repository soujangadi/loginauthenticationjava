package setterinjection;

public class Alpha {
	beta b;
	public Alpha() {
		System.out.println("you have created an object of Alpha");
	}
	public beta getBeta() { //getter and setter method
		return b;
	}
	public void setBeta(beta b) {
		this.b = b;
	}
	void print()
	{
		System.out.println("Hello Alpha");
	}
	void displayDetails() { //method to print details
		print();
		b.print();
	}
	

}
