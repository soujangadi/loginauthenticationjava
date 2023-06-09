import java.util.Scanner;
public class student {

			String name;
			int rollno;
			String city;
			
			Student(String stname, int strollno, String stcity){
				name = stuname;
				rollno = roll;
				city = cty;
			}
			public static void main(String[] args) {
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter the number of students: ");
				int count = scan.nextInt();
				Student[] stu = new Student[count];
				for(int i=0; i<count; i++) {
					System.out.println("Enter the name of Student " + (i+1) + " : ");
					String name = scan.next();
					System.out.println("Enter the roll no of Student " + (i+1) + " : ");
					int roll = scan.nextInt();
					System.out.println("Enter the city of Student " + (i+1) + " : ");
					String city = scan.next();
					Student s = new Student(name, roll, city);
					stu[i] = s;
				}
				System.out.println("-------------------------------------------");
				System.out.println("Name\t\tRollNo\t\tCity");
				System.out.println("-------------------------------------------");
				for(int i=0; i<stu.length; i++) {
					System.out.println(stu[i].name+"\t\t"+stu[i].rollno+"\t\t"+stu[i].city);
				}
				System.out.println("-------------------------------------------");
			}
		
		

	}


