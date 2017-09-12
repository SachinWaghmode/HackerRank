/*
Given a positive integer N, print count of set bits in it. For example, if the given number is 6,
output should be 2 as there are two set bits in it.

Input:

The first line of input contains an integer T denoting the number of test cases. Then T test cases follow.
The next T lines will contain an integer N.

Output:
Corresponding to each test case, in a new line, print count of set bits in it.

Constraints:

1 ≤ T ≤ 100

1 ≤ N ≤ 1000000


Example:

Input:

2
6
11
 

Output:
2
3

*/

import java.util.*;
import java.lang.*;
import java.io.*;

public	class GFG {
		public static void main (String[] args) {
			//code
			System.out.println("Enter number of test cases: ");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int[] input = new int[n]; 
			for (int i=0; i<n; i++){
			    System.out.println("Enter number: ");
			    input[i] = sc.nextInt();
			}
			for (int j=0; j<n; j++){
			    int bits = 1;
			    
			    int count = 0;
			    while( input[j] > 0){
			    	
			    if ( input[j] % 2 == 0){
			    		  bits = bits *2;
			    		  input[j] -= bits;
			    		  
				}else{
					input[j] -= bits;
				    bits = bits *2;
				}   
			    count++;
			    }
			    System.out.println(""+count);
			}		
		}
}
