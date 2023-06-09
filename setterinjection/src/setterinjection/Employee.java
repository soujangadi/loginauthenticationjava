package setterinjection;

public class Employee {
	private int id;
	private String name;  ///instance variable
	private String desig;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public void displayemployee() {
		System.out.println("id\t\t|name\t\t|desig");
		System.out.println(this.id+"\t\t"+this.name+"\t\t"+this.desig);
	}
}
