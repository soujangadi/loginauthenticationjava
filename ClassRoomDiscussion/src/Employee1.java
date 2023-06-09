 import java.util.Scanner;
public class Employee1 {
	String empname;
	int empid;
	double salary;
	String designation;
	String department;
	long mobile;
	String dob;
	String empaddress;
	String doj;
	
public Employee1(String empname, int empid, double salary, String designation, String department, long mobile,
			String dob, String empaddress, String doj) {
		super();
		this.empname = empname;
		this.empid = empid;
		this.salary = salary;
		this.designation = designation;
		this.department = department;
		this.mobile = mobile;
		this.dob = dob;
		this.empaddress = empaddress;
		this.doj = doj;
	}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("Enter Employee Name: ");
String empname = scan.next();
System.out.println("Enter Employee Id: ");
int empid = scan.nextInt();
System.out.println("Enter Employee Designation: ");
String desig = scan.next();
System.out.println("Enter Employee Salary: ");
double sal = scan.nextDouble();
System.out.println("Enter Employee Department: ");
String dept = scan.next();
System.out.println("Enter Employee Mobile No: ");
long mobile = scan.nextLong();
System.out.println("Enter Employee Address: ");
String address= scan.next();
System.out.println("Enter Employee Date of Birth: ");
String dob = scan.next();
System.out.println("Enter Employee Date of Joining: ");
String doj = scan.next();

Employee1 e = new Employee1(empname, empid, sal, desig, dept, address, mobile, dob, doj);		
System.out.println("Employee Data:");
System.out.println("Enter Employee Name: " + e.empname);
System.out.println("Enter Employee Id: " + e.empid);
System.out.println("Enter Employee Designation: "+ e.designation);
System.out.println("Enter Employee Salary: "+e.salary);
System.out.println("Enter Employee Department: "+e.department);
System.out.println("Enter Employee Mobile : "+e.mobile);
System.out.println("Enter Employee Address: "+e.empaddress);
System.out.println("Enter Employee Date of Birth: "+e.dob);
System.out.println("Enter Employee Date of Joining: "+e.doj);

}
}


	
		

	


