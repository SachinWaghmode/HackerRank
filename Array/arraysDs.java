/*
An array is a type of data structure that stores elements of the same type in a contiguous block of memory. In an array, , of size , each memory location has some unique index,  (where ), that can be referenced as  (you may also see it written as ).

Given an array, , of  integers, print each element in reverse order as a single line of space-separated integers.

Note: If you've already solved our C++ domain's Arrays Introduction challenge, you may want to skip this.

Input Format

The first line contains an integer,  (the number of integers in ). 
The second line contains  space-separated integers describing .

Constraints

Output Format

Print all  integers in  in reverse order as a single line of space-separated integers.

Sample Input

4
1 4 3 2

Sample Output

2 3 4 1

*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the number of elements in Array");
        int n = sc.nextInt();
        int[] array = new int[n];
        //System.out.println("Enter the elements in Array");
        for( int i=0; i < n; i++){
            array[i] = sc.nextInt();
        }
        //System.out.println("Desired Output: ");
        for( int j=n-1; j >= 0 ; j--){
            System.out.print(array[j]+" ");
        }
            
    }
}
