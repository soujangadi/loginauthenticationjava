import java.util.Scanner;
public class ArrayUtility {
	static Scanner  scan = new Scanner(System.in);
	static int[] mergeArrays(int a[],int b[]) {
		int c[]= new int[a.length+b.length];
		for(int i= 0; i<c.length;i++) {
			if(i<a.length) {
				c[i]= a[i];
			}
			else {
				c[i]=b[i -a.length];
			
			}
		}
		return c;
	}
	
	static int [] createArrays (int length) {
		int arr[]= new int[length];
		for(int i=0; i <arr.length; i++) {
			System.out.println("enter the values for "+ (i+1) + "elements");
			arr[i]=scan.nextInt();
		}
	return arr;
	}
	static void displayArray(String a[]) {
		System.out.print("[");
		
		for(int i =0; i<a.length; i++)
		{
			System.out.print(a[i]);
		if(i==a.length-1) {
			System.out.print("]");}
		else {
			System.out.print(",");
		}
		}
}
	}


