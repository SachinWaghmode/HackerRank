/*
Code pair problem
Consider a pair of integers, (a, b). We can perform the following operations on (a, b) in any order, zero or more times:

(a, b) → (a + b, b)
(a, b) → (a, a + b)
 

For example, you can start with (1, 4), perform the operation (1 + 4, 4) to get (5, 4), perform the operation (5, 5 + 4) to get (5, 9), and perform the operation (5, 5 + 9) to get (5, 14).

 

Complete the isPossible function in the editor below. It has four parameters:

An integer, a.
An integer, b.
An integer, c.
An integer, d.
The function must return a string denoting whether or not you can convert (a, b) to (c, d) by performing zero or more of the operations specified above. If it is possible, return the string Yes; otherwise, return No.

 

Input Format

Locked stub code in the editor reads the following input from stdin and passes it to the function:

The first line contains an integer denoting a.

The second line contains an integer denoting b.

The third line contains an integer denoting c.

The fourth line contains an integer denoting d.

 

Constraints

1 ≤ a, b, c, d ≤ 1000
 

Output Format

The function must return the string Yes if it's possible to convert (a, b) to (c, d) by performing zero or more of the operations specified above; otherwise, it must return No. This is printed to stdout by locked stub code in the editor.

 

Sample Input 0

1
4
5
9
 

Sample Output 0

Yes
 

Explanation 0

We can convert (1, 4) to (5, 9) by performing the following sequence of operations: (1, 4) → (5, 4) → (5, 9). Thus, we return Yes as our answer.

 

Sample Input 1

1
2
3
6
 

Sample Output 1

No
 

Explanation 1

If we tried the operation (1, 2) → (3, 2), we can successfully match c = 3 but no subsequent possible operation will ever get us to d = 6. The only other option for our first operation is (1, 2) → (1, 3); we could certainly perform subsequent operations to get us to d = 6 but no operation would ever get us to c = 3 because any value added to a after this first operation would result in an a > c. Thus, we return No as our answer.

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
   static String isPossible(int a, int b, int c, int d) {
                 
                 if(a==c && b==d) return "Yes";
                 
                 while(a<c || b<d){
                     if(a<c)
                         a= a+b;
                     if(b<d)
                         b = a+b;
                     if(a==c && b==d) return "Yes";
                 }
                 
                 if(a>c || b>d) return "No";
            
                 return "No";
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

        String res;
        int a;
        a = Integer.parseInt(in.nextLine().trim());

        int b;
        b = Integer.parseInt(in.nextLine().trim());

        int c;
        c = Integer.parseInt(in.nextLine().trim());

        int d;
        d = Integer.parseInt(in.nextLine().trim());

        res = isPossible(a, b, c, d);
        bw.write(res);
        bw.newLine();

        bw.close();
    }
}

// Recommendated Solution: Reverse approach
static String isPossible(int a, int b, int c, int d) {
                 
                 if(a==c && b==d) return "Yes";
                 
                 while(!(a==c && b==d) && Math.abs(c-d)>0){
                     if(c>d)
                         c-=d;
                     else
                         d-=c;
                 }
 
                 if(a==c && b==d) return "Yes";
                 else return "No";
    }

