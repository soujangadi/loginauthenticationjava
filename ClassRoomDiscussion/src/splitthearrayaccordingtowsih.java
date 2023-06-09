import java.util.Scanner;
public class splitthearrayaccordingtowsih {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,};
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the split value");
		int fasize = scan.nextInt();
		int b[] = new int[fasize];
		int c[] = new int[a.length -b.length];
		for(int i=0;i<a.length;i++) {
			if(i<fasize) {
				b[i]= a[i];}
				else
				{
					c[i-b.length] = a[i];
					
				}
					
			System.out.println("printing the first part of array");
			ArrayUtility.displayArray(a);
		}
		

	}

}
