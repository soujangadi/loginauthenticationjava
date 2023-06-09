import java.util.Scanner;
public class Menu {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("choose from the option below:");
		do
		{
			System.out.println("1 . Yawn\n2  2.Snore\n3" +
		"3. Sleepwalking\n4 . 4. Nightmare\n"
					+ "5.exit");
			System.out.println("Enter a choice [1 to 5]:");
			int choice =scan.nextInt();
			switch(choice)
			{
			case 1 :
				System.out.println("curdrice yawn");
				break;
			case 2 :
				System.out.println("snore like lion");
				break;
			case 3 :
				System.out.println("walk like zombie");
				break;
			case 4 :
				System.out.println("keep dreaming");
				break;
			case 5:
				System.out.println("thank you for wonderful joureny");
				return;
				default:
					System.out.println("invalid output");
			}
		
			while(true);
			
			
		
	}
}
		
		
		

	


