/*
Code pair problem
Mary has three sticks of lengths a, b, and c, and wants to determine whether she can use them to form a non-degenerate triangle. For example, the stick lengths a = 3, b = 4, and c = 5 form a valid triangle, but the stick lengths a = 1, b = 2, and c = 6 do not.

Complete the function in the editor below. It has the following parameters:

Name	Type	Description
a	integer array	An array of n integers where each index i describes the length of side a for triangle i.
b	integer array	An array of n integers where each index i describes the length of side b for triangle i.
c	integer array	An array of n integers where each index i describes the length of side c for triangle i.
The function must return an array of n strings where the value at each index i is Yes if ai, bi, and ci can form a non-degenerate triangle; otherwise, it's No.

Input Format

The first line contains an integer, n, denoting the number of elements in a.
Each line i of the n subsequent lines (where 0 ≤ i < n) contains an integer describing ai.
The next line contains an integer, n, denoting the number of elements in b.
Each line i of the n subsequent lines (where 0 ≤ i < n) contains an integer describing bi.
The next line contains an integer, n, denoting the number of elements in c.
Each line i of the n subsequent lines (where 0 ≤ i < n) contains an integer describing ci.

Constraints

1 ≤ n ≤ 105
1 ≤ ai, bi, ci ≤ 103 , where 0 ≤ i < n
Output Format

Return an array of n strings where the value at each index i is Yes if ai, bi, and ci can form a non-degenerate triangle; otherwise, it's No.

Sample Case 0
Sample Input

3
7
10
7
3
2
3
4
3
2
7
4
Sample Output

No
No
Yes
Explanation

We want to check the following n = 3 possible triangles using the values given by a = [7, 10, 7], b = [2, 3, 4], and c = [2, 7, 4]:

a0 = 7, b0 = 2, and c0 = 2 don't form a valid, non-degenerate triangle, so we store No in index 0 of our return array.
a1 = 10, b1 = 3, and c1 = 7 don't form a valid, non-degenerate triangle, so we store No in index 1 of our return array.
a2 = 7, b2 = 4, and c2 = 4 do form a valid, non-degenerate triangle, so we store Yes in index 2 of our return array.
We then return the array ["No", "No", "Yes"] as our answer.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the function below.
     */
    static String[] triangleOrNot(int[] a, int[] b, int[] c) {
        
        String[] result = new String[a.length];
        int[] side = new int[3]; 
        
        for(int i=0; i<a.length; i++){
            side[0] = a[i];
            side[1] = b[i];
            side[2] = c[i];
          
            Arrays.sort(side);
            
            if(side[2] - side[0] < side[1]){
                result[i] = "Yes";
            } 
            else{
                result[i] = "No";
            } 
        }
        return result;
    }
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = null;
        if (fileName != null) {
            bw = new BufferedWriter(new FileWriter(fileName));
        }
        else {
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        String[] res;
        int a_size = 0;
        a_size = Integer.parseInt(in.nextLine().trim());

        int[] a = new int[a_size];
        for(int i = 0; i < a_size; i++) {
            int a_item;
            a_item = Integer.parseInt(in.nextLine().trim());
            a[i] = a_item;
        }

        int b_size = 0;
        b_size = Integer.parseInt(in.nextLine().trim());

        int[] b = new int[b_size];
        for(int i = 0; i < b_size; i++) {
            int b_item;
            b_item = Integer.parseInt(in.nextLine().trim());
            b[i] = b_item;
        }

        int c_size = 0;
        c_size = Integer.parseInt(in.nextLine().trim());

        int[] c = new int[c_size];
        for(int i = 0; i < c_size; i++) {
            int c_item;
            c_item = Integer.parseInt(in.nextLine().trim());
            c[i] = c_item;
        }

        res = triangleOrNot(a, b, c);
        for(int res_i = 0; res_i < res.length; res_i++) {
            bw.write(String.valueOf(res[res_i]));
            bw.newLine();
        }

        bw.close();
    }
}
