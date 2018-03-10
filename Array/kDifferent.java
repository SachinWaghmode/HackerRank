/*
Code Pair Problem:

Complete the kDifference function in the editor below. It has two parameters:

An array of n positive distinct integers, a.
An integer, k.
The function must return an integer denoting the total number of pairs of elements, (ai, aj), in array a where ai + k = aj.

 

Input Format

Locked stub code in the editor reads the following input from stdin and passes it to the function:

The first line contains an integer, n, denoting the number of elements in array a.

Each line i of the n subsequent lines (where 0 ≤ i < n) contains an integer describing ai.

The last line contains an integer, k.

 

Constraints

5 ≤ n ≤ 105
Each ai ≤ 2 × 109.
1 ≤ k ≤ 109
 

Output Format

The function must return an integer denoting the number of pairs in array a whose difference is k. This is printed to stdout by locked stub code in the editor.

 

Sample Input 0

5
1
5
3
4
2
2
 

Sample Output 0

3
 

Explanation 0

We must count the number of pairs in a = [1, 5, 3, 4, 2] whose difference is k = 2. We can find the following three pairs: (1, 3), (5, 3), and (4, 2). Thus, we return 3 as our answer.

 

Sample Input 1

10
363374326
364147530
61825163
107306571
128124602
139946991
428047635
491595254
879792181
106926279
1
 

Sample Output 1

0
 

Explanation 1

We must count the number of pairs in a = [363374326, 364147530, 61825163, 107306571, 1281246024, 139946991, 428047635, 491595254, 879792181, 106926279] whose difference is k = 1. Because no such pair of integers exists in a, we return 0.

 

Sample Input 2

6
2
4
6
8
10
12
2
 

Sample Output 2

5
 

Explanation 2

We must count the number of pairs in a = [2, 4, 6, 8, 10, 12] whose difference is k = 2. We can find the following three pairs: (2, 4), (4, 6), (6, 8), (8, 10), and (10, 12). Thus, we return 5 as our answer.
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
    static int kDifference(int[] a, int k) {
        int count =0;
        for(int j=0;j<a.length-1; j++){
            for(int i=j+1; i<a.length; i++){
                int ak = Math.abs(a[j]-a[i]);
                if(ak==k){
                    count++;
                }
            }
        }
        return count;
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

        int res;
        int a_size = 0;
        a_size = Integer.parseInt(in.nextLine().trim());

        int[] a = new int[a_size];
        for(int i = 0; i < a_size; i++) {
            int a_item;
            a_item = Integer.parseInt(in.nextLine().trim());
            a[i] = a_item;
        }

        int k;
        k = Integer.parseInt(in.nextLine().trim());

        res = kDifference(a, k);
        bw.write(String.valueOf(res));
        bw.newLine();

        bw.close();
    }
}
