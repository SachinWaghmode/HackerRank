/*
Code pair problem
Julia has a string, s, consisting of one or more of the following letters: a, e, i, o, and u.

 

We define a magical subsequence of s to be a sequence of letters derived from s that contains all five vowels in order. This means a magical subsequence will have one or more a's followed by one or more e's followed by one or more i's followed by one or more o's followed by one or more u's. For example, if s = "aeeiooua", then "aeiou" and "aeeioou" are magical subsequences but "aeio" and "aeeioua" are not.

 

Complete the longestSubsequence function in your editor. It has 1 parameter: a string, s. It must return an integer denoting the length of the longest magical subsequence in s. If no magical subsequence can be constructed, return 0.

 

Input Format

The locked stub code in your editor reads a single string, s, from stdin and passes it to your function.

 

Constraints

5 < length of string s < 5 × 105
String s is composed of English vowels (i.e., a, e, i, o, and u).
 

Output Format

Your function must return an integer denoting the length of the longest magical subsequence in s (if no such subsequence exists, this value is 0). This is printed to stdout by the locked stub code in your editor.

 

Sample Input 1

aeiaaioooaauuaeiou
 

Sample Output 1

10
 

Explanation 1

In the table below, the component characters of the longest magical subsequence are red:

a	e	i	a	a	i	o	o	o	a	a	u	u	a	e	i	o	u
 

Sample Input 2

aeiaaioooaa
 

Sample Output 2

0
 

Explanation 2

String s does not contain the letter u, so it is not possible to construct a magical subsequence.

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MagicalVowels {

    /*
     * Complete the function below.
     */
    static int longestSubsequence(String s) {
        
        char[] vowels ={'*','a','e','i','o','u'};
        int j=1, count=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==vowels[j]){
                count++;
                
            }
            else if( j<vowels.length-1 && s.charAt(i)==vowels[j+1] && vowels[j-1] == '*' && count>=1){
               // if((vowels[j]=='a' && s.charAt(i) == 'e') || (vowels[j]
                vowels[j]='*';
                j++;
                i--;
                
            }
        }
        vowels[j]='*';
       for(char c: vowels){
           if (c!='*') return 0;
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
        String s;
        try {
            s = in.nextLine();
        } catch (Exception e) {
            s = null;
        }
       
        res = longestSubsequence(s);
        bw.write(String.valueOf(res));
        bw.newLine();

        bw.close();
    }
}
