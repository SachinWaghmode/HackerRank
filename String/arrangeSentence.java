/*
CodePair problems :
We define the variable sentence to be a string of space-separated words that starts with a capital letter followed by lowercase letters and spaces, and ends with a period (i.e., it satisfies the regular expression ^[A-Z][a-z ]*\.$). We want to rearrange the words in sentence such that the following conditions are satisfied:

Each word is ordered by ascending word length. For example, the word rank (which has 4 letters) would come before the word hacker (which has 6 letters).
The rearranged sentence must be formatted to satisfy the regular expression ^[A-Z][a-z ]*\.$ (i.e., start with a capital letter, followed by lowercase letters and spaces, and terminated by a period).
If two or more words have equal length, they must appear in the same order as in the original sentence. For example, Cats and hats. would become And cats hats.
Complete the function in the editor below. It has one parameter:

Name	Type	Description
sentence	string	A string of space-separated words satisfying the regular expression ^[A-Z][a-z ]*\.$.
Return a string denoting the rearranged sentence satisfying the criteria above.

Input Format

A single line of space-separated words denoting sentence.

Constraints

2 ≤ length of sentence < 105
It is guaranteed that sentence satisfies the regular expression ^[A-Z][a-z ]*\.$.
Output Format

Return a string denoting the sorted sentence according to length.

Sample Input 0

The lines are printed in reverse order.
Sample Output 0

In the are lines order printed reverse.
Explanation 0

We organize the strings of each respective length in sentence = The lines are printed in reverse order. as:

Length 2: {in}
Length 3: {the, are}
Length 5: {lines, order}
Length 7: {printed, reverse}
We then reassemble our sequences of words as a sentence string, ensuring that the first letter is uppercase, the intermediate letters are lowercase, and the string terminates with a period. Thus, we return In the are lines order printed reverse. as our answer.

Sample Input 1

Here i come.
Sample Output 1

I here come.
Explanation 1

We organize the strings of each respective length in sentence = Here i come. as:

Length 1: {i}
Length 4: {here, come}
We then reassemble our sequences of words as a sentence string, ensuring that the first letter is uppercase, the intermediate letters are lowercase, and the string terminates with a period. Thus, we return I here come. as our answer.

Sample Input 2

I love to code.
Sample Output 1

I to love code.
Explanation 1

We organize the strings of each respective length in sentence = I love to code. as:

Length 1: {i}
Length 2: {to}
Length 4: {love, code}
We then reassemble our sequences of words as a sentence string, ensuring that the first letter is uppercase, the intermediate letters are lowercase, and the string terminates with a period. Thus, we return I to love code. as our answer.
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
    static String arrange(String sentence) {
        
        StringBuilder sb = new StringBuilder();
        sentence  = sentence.replace('.',' ');
        String[] words = sentence.split(" ");
        boolean flag=true;
        
        while(flag){
            flag = false;
            for(int j=0; j<words.length-1; j++){
                words[j] = words[j].toLowerCase();
                 if(words[j].length() > words[j+1].length() ){
                     String temp = words[j];
                     words[j] = words[j+1];
                     words[j+1] = temp;
                     flag = true;
                }
            }
        }
         String s1 = words[0].substring(0, 1).toUpperCase() + words[0].substring(1);
         words[0] = s1;
         
         for(int i=0; i< words.length-1; i++){
             sb.append(words[i]);
             sb.append(" ");
         }
         sb.append(words[words.length-1]);
         sb.append(".");
        return sb.toString();

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
        String sentence;
        try {
            sentence = in.nextLine();
        } catch (Exception e) {
            sentence = null;
        }

        res = arrange(sentence);
        bw.write(res);
        bw.newLine();

        bw.close();
    }
}
