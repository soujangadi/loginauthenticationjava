
public class additionalofrowsandcoloumns {

	public static void main(String[] args) {
		
		 int a[][] = {     
                 {1, 2, 3},  
                 {4, 5, 6},  
                 {7, 8, 9}  
             };  
     
   
   int row = a.length;  
 int col = a[1].length;  
   System.out.println("Printing the sum of rows");
for(int i = 0; i < row; i++){ //row elements
    int sumRow = 0;  
     for(int j = 0; j < col; j++){  
       sumRow = sumRow + a[i][j];  
     }  
     System.out.println("Sum of " + (i+1) +" row: " + sumRow);  
 }  
System.out.println("Printing the sum of coloumns");
for(int j = 0; j< row; j++){ 
    int ColRow = 0;  
     for(int i = 0; i< col; i++){  
       ColRow = ColRow + a[i][j];  
     }  
   
	System.out.println("Sum of " + (j+1) +" col: " + ColRow);  
 }  
}  
 
 
}  
 
		
	
	

