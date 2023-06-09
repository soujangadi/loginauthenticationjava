import java.util.LinkedList;
import java.util.Scanner;
public class playlist {
	public static void main(String[] args) {


				LinkedList<String>names=new LinkedList<String>();
				//To add elements into LinkedList
				names.add("devotional");
				names.add("romantic");   // add the elements in the style of stack
				names.add("sad"); 
				names.add("band"); 
				names.add("slow music");
				names.add("marati");
				
	
		     Scanner scan = new Scanner(System.in);
					System.out.println("choose from the option below:");
					
						System.out.println("Enter a choice [1 to 5]:");
						int choice =scan.nextInt();
						switch(choice)
						{
						case 1 :
							System.out.println("first song is played ");
							System.out.println(names.getFirst());
							break;
						case 2 :
							System.out.println("song last is played");
							System.out.println(names.getLast());
							break;
						case 3 :
							System.out.println("previous song is played");
							System.out.println(names.pollFirst());
							break;
						case 4 :
							System.out.println("next song is played");
							System.out.println(names.pollLast());
							break;
						case 5:
							System.out.println("exit");
							return;
							default:
								System.out.println("invalid output");
						}
	

								 public static void play(LinkedList<names>) {

								        Scanner scanner = new Scanner(System.in);
								        boolean forward = true;
								        boolean isQuit = false;

								        ListIterator<names> listIterator = playlist.listIterator();
//								    ListIterator<Song> listIterator = playList.listIterator();


								        if (names.size() == 0) {
								            System.out.println("NO SONG IN PLAYLIST");
								            return;
								        } else {
								            System.out.println("NOW PLAYING " + listIterator.next().toString());
								            printMenu();
								        }

								        while (!isQuit) {
								            int choose = scanner.nextInt();
								            scanner.nextLine();
						}
	
}
					
						
						
						
					
				
			
					
					
					


	

	
	
	


