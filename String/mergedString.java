/*
Code pair problem

You are merging data from two sources connected to a network access point to create a new data packet.

 

You must merge strings a and b, and then return a single merged string. A merge operation on two strings is described as follows:

Append alternating characters from a and b, respectively, to some new string, mergedString.
Once all of the characters in one of the strings have been merged, append the remaining characters in the other string to mergedString.
 

Function Description

Complete the function mergeStrings in the editor below. It has the following properties:

Parameters	
Name	Type	Description
a	String	Input String
b	String	Input String
Return	The function must return the merged string.
 

Constraints

1 ≤ |a|, |b| ≤ 25000
Input Format For Custom Testing
The locked stub code in your editor reads two strings, a and b, from stdin and passes them to your function.

Sample Case 0
 

Sample Input For Custom Testing

abc
def
 

Sample Output

adbecf
 

Explanation

a = abc

b = def

Taking alternate characters from both the strings, we get adbecf

Sample Case 1
Sample Input For Custom Testing

ab
zsd
 

Sample Output

azbsd
 

Explanation

a = ab

b = zsd 

Taking alternate characters from both the strings, we get azbsd
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

    static String mergeStrings(String a, String b) {
        if (a.length()<=0 && b.length()<=0) return a;
        else if(a.length()<=0) return b;
        else if(b.length()<=0) return a;
        int i=0,j=0;
        StringBuilder sb = new StringBuilder();
        while(i<a.length() || j<b.length())
        {
           
             if(i>=a.length()){
                sb.append(b.charAt(j));
                }
                
             else if(j>=b.length()){
                 sb.append(a.charAt(i));
             }
             else{
              sb.append(a.charAt(i));
              sb.append(b.charAt(j));
             }
            i++;
            j++;
        }
       
        return sb.toString();

    }

    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        String res;
        String _a;
        try {
            _a = in.nextLine();
        } catch (Exception e) {
            _a = null;
        }
        
        String _b;
        try {
            _b = in.nextLine();
        } catch (Exception e) {
            _b = null;
        }
        
        res = mergeStrings(_a, _b);
        bw.write(res);
        bw.newLine();
        
        bw.close();
    }
}
