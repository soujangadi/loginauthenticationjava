import java.util.Scanner;
public class reversestring {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter the string");
		String st =s.next();
		String ss = " ";

		for( int i = st.length()-1 ; i>=0; i--) {
		  ss += st.charAt(i);
		}

		System.out.println(ss);
		

	}

}
