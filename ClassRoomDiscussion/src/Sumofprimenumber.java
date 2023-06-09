import java.util.Scanner;
public class Sumofprimenumber {
	static boolean isPrime(int n) {
		int factor = 0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				factor++;
				
			}
		}
  if (factor==2) {
	  return true;
}
else {
	return false;
}
}
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		 
				
				for(int i = 2; i <= n; i++)
				{
					if(isPrime(i)  && isPrime(n-i)) {
				    System.out.println(n + " = " + i + " + " + (n-i));
				}
		                
		}

	}

}
