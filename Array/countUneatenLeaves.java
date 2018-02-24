/*
Code pair problem:
k caterpillars are eating their way through n leaves. Each caterpillar falls from leaf to leaf in a unique sequence. All caterpillars start at a twig in position 0 and fall onto the leaves at positions between 1 and n.  Each caterpillar i has an associated 'jump-number' ai. A caterpillar with jump number j eats leaves at positions that are multiples of j. It will proceed in the order j, 2j, 3j, ... till it reaches the end of the leaves, then it stops and builds a cocoon.

 

Complete the function countUneatenLeaves that has two parameters- an integer n and an array a. The function should return the number of uneaten leaves.

 

Input Format

The first line of the input is an integer n, total number of leaves. The second line of the input is an integer k, total number of caterpillars. Each of the next k lines contains a single integer ai.

 

Constraints

1 ≤ n ≤ 2 x 109

1 ≤ k ≤ 18
2 ≤ ai ≤ 22, 0 ≤ i < k
 

Output Format

The function should return the number of uneaten leaves.

 

Sample Input 1

10
3
2
4
5
 

Sample Output 1

4
 

Sample Input 2

20
3
3
7
5
 

Sample Output 2

9
 

Explanation

Sample Case 1

All leaves which are multiples of 2, 4 and 5 are eaten. Only 4 leaves which are numbered 1, 3, 7 and 9 are left.

 

Sample Case 2

All leaves which are multiples of 3, 5 and 7 are eaten. Only 9 leaves which are numbered 1, 2, 4, 8, 11, 13, 16, 17 and 19 are left.
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
    static int countUneatenLeaves(int n, int[] a) {
        int count = 0;
        if (a[0] > 1 ) count = 1;
        for(int i=n; i>=2; i--){
            boolean eaten = false;
            for(int j=0; j<a.length; j++){
                 if(i%a[j] == 0){
                     eaten = true;
                     break;
                 }
            }
            if (!eaten) count++; 
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
        int n;
        n = Integer.parseInt(in.nextLine().trim());

        int a_size = 0;
        a_size = Integer.parseInt(in.nextLine().trim());

        int[] a = new int[a_size];
        for(int i = 0; i < a_size; i++) {
            int a_item;
            a_item = Integer.parseInt(in.nextLine().trim());
            a[i] = a_item;
        }

        res = countUneatenLeaves(n, a);
        bw.write(String.valueOf(res));
        bw.newLine();

        bw.close();
    }
}
