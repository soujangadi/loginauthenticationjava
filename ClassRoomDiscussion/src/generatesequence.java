//given numbers 1,2,3,4 only generste a sequence of unique 3 digit numbers where all the digits 
//in the nmber are unique
//example:
//123 213 312 412
//124 214 314 413
//132 231 321 421 
//134 234 324 423
//142 241 341 431
//143 243 342 432
public class generatesequence {

	private static int i;

	public static void main(String[] args) {
		System.out.println("generating the sequence :");
	
		for(int i =1;i<=4;i++)
		{
			for(int j = 1;j<=4;j++)
			{
				for(int k = 1;k<=4;k++)
				
				{
				
				if(i!=j && j!=k && k!=i)
					System.out.println(i+""+j+""+k);
			}
	}
		}
}
}