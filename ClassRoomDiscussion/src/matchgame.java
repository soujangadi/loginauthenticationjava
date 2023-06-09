
public class matchgame {

	public static void main(String[] args) {
	String[] muzam = {"1,2,3,4,5"};
	String[] sunny = {"8,9,10,11,12,13,14,15,16,"};
	int i = 0,j = 0,k = 0;
	 String[] common = new String[muzam.length+sunny.length];
	while (i<muzam.length && j<sunny.length) {
		common[k++] =muzam[i++];
		common[k++] =sunny[i++];
	}
	while(i < muzam.length) {
		common[k++] =muzam[i++];
		
	}
	while(j<sunny.length) {
		common[k++]=sunny[j++];
		
	}
   ArrayUtility.displayArray(common);
	}

}
