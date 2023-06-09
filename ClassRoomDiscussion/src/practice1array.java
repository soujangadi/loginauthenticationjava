//create an array whose lenghth is sum of an lenghth of array one and array 2
public class practice1array {

	public static void main(String[] args) {
		int [] arr1 = {3,4,5,6,7,8};
		int [] arr2 = {10,15,21,36,49,64,78,97};
		int [] arr3 = new int[arr1.length + arr2.length];// creating the new array
		
		for(int i=0; i < arr3.length; i++)// iteration for array length 3 in order to print
		{
 
		if(i < arr1.length)
		{
			arr3[i]=arr1[i];
		}
		else
		{
			arr3[i]=arr2[i-arr1.length]; // array display logic
	
		}
		}
		for(int ele:arr3) { //
			System.out.print(ele + " ");
		}


	}

}
