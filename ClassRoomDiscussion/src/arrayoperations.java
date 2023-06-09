import java.util.Scanner;

public class arrayoperations {

	public static void main(String[] args) {
		//Create two arrays
	//Merge those arrays
//dISPLAY THE MERGED ARRAYS
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of firts array:");
		int falength =scan.nextInt();
		int arr1[] = ArrayUtility.createArrays(falength);
		System.out.println("Enter the length of second array:");
		int salength = scan.nextInt();
		int arr2[]= ArrayUtility.createArrays(salength);
		int result[]= ArrayUtility.mergeArrays(arr1, arr2);
		ArrayUtility.displayArray(result);
	}

}
