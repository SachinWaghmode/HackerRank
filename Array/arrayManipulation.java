/*
You are given a list(1-indexed) of size , initialized with zeroes. You have to perform  operations on the list and output the maximum of final values of all the  elements in the list. For every operation, you are given three integers ,  and  and you have to add value  to all the elements ranging from index  to (both inclusive).

For example, consider a list  of size . The initial list would be  = [, , ] and after performing the update  = , the new list would be  = [, , ]. Here, we've added value 30 to elements between indices 2 and 3. Note the index of the list starts from 1.

Input Format

The first line will contain two integers  and  separated by a single space.
Next  lines will contain three integers ,  and  separated by a single space.
Numbers in list are numbered from  to .

Constraints

Output Format

Print in a single line the maximum value in the updated list.

Sample Input

5 3
1 2 100
2 5 100
3 4 100
Sample Output

200
Explanation

After first update list will be 100 100 0 0 0. 
After second update list will be 100 200 100 100 100.
After third update list will be 100 200 200 200 100.
So the required answer will be 200.
*/

//Solution:


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long max = 0;
        long[] arr = new long[n];
       
        for(int a0 = 0; a0 < m; a0++){
            int a = in.nextInt();
            int b = in.nextInt();
            int k = in.nextInt();
            
            for(int i=a-1; i<=b-1; i++){
                arr[i] += k;
                max = Math.max(max, arr[i]);
            }
           
       
        }
        in.close();
         
        System.out.println(max);
        
    }
}
