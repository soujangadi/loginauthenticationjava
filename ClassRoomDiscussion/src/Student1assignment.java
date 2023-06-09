
		import java.util.Scanner;

		public class Student1assignment {
			String name;
			int rollno;
			String city;
			int percentage;
			String dept;
			Student1assignment(String stuname, int roll, String cty ,int id ,String dpt,int ptg){
				name = stuname;
				rollno = roll;
				city = cty;
				percentage = ptg;
				dept = dpt ;
			}
			public static void main(String[] args) {
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter the number of students: ");
				int count = scan.nextInt();

				for(int i=0; i<= count; i++) {
					System.out.println("Enter the name of Student " + (i+1) + " : ");
					String name = scan.next();
					System.out.println("Enter the roll no of Student " + (i+1) + " : ");
					int roll = scan.nextInt();
					System.out.println("Enter the city of Student " + (i+1) + " : ");
					String city = scan.next();
					System.out.println("Enter the percentage of Student " + (i+1) + " : ");
					String percentage = scan.next();
					System.out.println("Enter the dept of Student " + (i+1) + " : ");
					String name = scan.next();
					Student s = new Student(name, roll, city,percentage,dept);
					ptg[i] = p;
				}
				System.out.println("-------------------------------------------");
				System.out.println("students who scored 75 and above");
				System.out.println("-------------------------------------------");
				if(ptg[i] >75) {
					System.out.println("is high");
					}
				else
				{
	System.out.println("less percentage");
			}
		}
	}


