/*
Context 
Given a  2D Array, :

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
We define an hourglass in  to be a subset of values with indices falling in this pattern in 's graphical representation:

a b c
  d
e f g
There are  hourglasses in , and an hourglass sum is the sum of an hourglass' values.

Task 
Calculate the hourglass sum for every hourglass in , then print the maximum hourglass sum.

Note: If you have already solved the Java domain's Java 2D Array challenge, you may wish to skip this challenge.

Input Format

There are  lines of input, where each line contains  space-separated integers describing 2D Array ; every value in  will be in the inclusive range of  to .

Constraints

Output Format

Print the largest (maximum) hourglass sum found in .

Sample Input

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0
Sample Output

19
Explanation

 contains the following hourglasses:

1 1 1   1 1 0   1 0 0   0 0 0
  1       0       0       0
1 1 1   1 1 0   1 0 0   0 0 0

0 1 0   1 0 0   0 0 0   0 0 0
  1       1       0       0
0 0 2   0 2 4   2 4 4   4 4 0

1 1 1   1 1 0   1 0 0   0 0 0
  0       2       4       4
0 0 0   0 0 2   0 2 0   2 0 0

0 0 2   0 2 4   2 4 4   4 4 0
  0       0       2       0
0 0 1   0 1 2   1 2 4   2 4 0
The hourglass with the maximum sum () is:

2 4 4
  2
1 2 4
*/


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int[][] array = new int[6][6];
        int sum=0, result=0, sub=0;
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter array elements")
        for(int x=0 ; x < 6; x++){
           for( int y=0; y < 6; y++) {
                    array[x][y]= sc.nextInt();
           }
        }
        //System.out.println("Desired Sum : ")
        for( int k=0; k < 4; k++){
            for( int m=0; m < 4; m++){
                for ( int i=k; i < k+3; i++ ){
                    int j=0; 
                    for ( j=m; j < m+3; j++){
                        if( i != k+1){
                            sum += array[i][j];
                        }
                        else{
                            sum += array[i][j+1];
                            break;
                        }
                    }
                }
                result = Math.max(result, sum);
                sum = 0;      
            }
        }
        System.out.println(result);
                
    }
}
