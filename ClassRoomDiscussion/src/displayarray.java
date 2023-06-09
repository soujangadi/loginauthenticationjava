
public class displayarray {

	public static void main(String[] args) {
		int [] arr = {101,345,564,864,97};
		System.out.println("[");
		for(int i=0; i< arr.length; i++) {
			System.out.println(arr[i]);
			if(i==arr.length-1) {
				System.out.println("]");
			}
			else {
				System.out.println(",");
			}
		}
		