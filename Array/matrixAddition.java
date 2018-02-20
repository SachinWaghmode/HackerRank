import java.util.*;
public class matrixAddition {

	public static void main(String[] args){
		
		System.out.println("Enter the number of rows");
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		
		System.out.println("Enter number of columns");
		int columns = sc.nextInt();
    
		int[][] a = new int[rows][columns];
		int[][] b = new int[rows][columns];
		int[][] sum = new int[rows][columns];
		
		System.out.println("Enter data for first matrix");
		for(int i =0; i<rows; i++){
			for(int j=0; j<columns; j++){
				a[i][j] = sc.nextInt();
			}
		}	
		
    System.out.println("Enter data for second matrix");
		for( int i =0; i<rows; i++){
				for( int j=0; j<columns; j++){
        b[i][j] = sc.nextInt();
			}
		}
			
			
		System.out.println("Addition of two matrix");
		 for(int i=0;i<rows;i++){
			 for(int j=0;j<columns;j++){
				 sum[i][j] = a[i][j] + b[i][j] ;
				 System.out.println(sum[i][j]+"\t");
			 }
		 }
		}
	}
