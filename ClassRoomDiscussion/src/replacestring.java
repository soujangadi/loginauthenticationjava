
public class replacestring {

	public static void main(String[] args) {
		String str = "God created Human.";  
		var size = str.length();  
		  
		System.out.println(str);  
		String target = null;  
		  
		// replacing null with JavaTpoint. Hence, the NullPointerException is raised.  
		str = str.replace(target, "Human ");  
		  
		System.out.println(str);  
		  
		}  
		 

	}

