/*
Code pair problem
We consider a string consisting of two or more lowercase English alphabetic letters (i.e., [a-z]) to be amazing if no adjacent characters in the string are equal. For example, the strings "abc", "abab", and "abca" are amazing; however, the strings "aab", "abba", and "abcaa" are not amazing. If a string is not amazing, then we can perform zero or more replace operations on the string. We define a single replace operation to be the replacement of any character in the string with any other lowercase English alphabetic letter.

 

Complete the minimalOperations function in your editor. It has one parameter: an array of n strings, words. The function must return an array of n integers where the value at each index i denotes the minimum number of replace operations necessary to make string wordsi amazing.

 

Input Format

Locked stub code in the editor reads the following input from stdin and passes it to the function:

The first line contains an integer, n, denoting the total number of elements in words.

Each line i of the n subsequent lines (where i ≤ 0 < n) contains a string describing wordsi.

 

Constraints

1 ≤ n ≤ 100
2 ≤ length of wordsi ≤ 105
It is guaranteed that wordsi consists of lowercase English alphabetic letters (i.e., [a-z]) only.
 

Output Format

Return an array of n integers where the value at each index i denotes the minimum number of replace operations necessary to make string wordsi amazing.

 

Sample Input 0

5
ab
aab
abb
abab
abaaaba
 

Sample Output 0

0
1
1
0
1
 

Explanation 0

Let's call our return array ops. We fill ops as follows:

 

word = "ab" is already amazing, so we need not perform any replace operations and ops[0] = 0.
word = "aab" is not amazing. We can replace word0 = 'a' with 'g' to get the amazing string "gab", so ops[1] = 1 as we only performed one replace operation.
word = "abb" is not amazing. We can replace word2 = 'b' with 'c' to get the amazing string "abc", so ops[2] = 1 as we only performed one replace operation.
word = "abab" is amazing so we need not perform any replace operations, so ops[3] = 0.
word = "abaaaba" is not amazing. We can replace word3 = 'a' with 'b' to get the amazing string "abababa", so ops[4] = 1 as we only performed one replace operation.
 

We then return ops = [0, 1, 1, 0, 1].
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
    static int[] minimalOperations(String[] words) {
        int[] amazing = new int[words.length];
        for(int i=0; i<words.length; i++){
            String temp = words[i];
            int j=0, count=0;
            while(j<temp.length()-1){
                if(temp.charAt(j) == temp.charAt(j+1) ){
                     count++;
                }
               j++;
            }
            if (count>1) count=(count/2);
            
            amazing[i] = count;
        }
        return amazing;

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

        int[] res;
        int words_size = 0;
        words_size = Integer.parseInt(in.nextLine().trim());

        String[] words = new String[words_size];
        for(int i = 0; i < words_size; i++) {
            String words_item;
            try {
                words_item = in.nextLine();
            } catch (Exception e) {
                words_item = null;
            }
            words[i] = words_item;
        }

        res = minimalOperations(words);
        for(int res_i = 0; res_i < res.length; res_i++) {
            bw.write(String.valueOf(res[res_i]));
            bw.newLine();
        }

        bw.close();
    }
}
