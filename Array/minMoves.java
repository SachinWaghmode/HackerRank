/*
Hackerrank Problem:

Given an array containing sequence of bits (0 or 1), 
you have to sort this array in the ascending order i.e. all 0' in first part of array followed by all 1's. 
The constraints is that you can swap only the adjacent elements in the array. 
Find the minimum number of swaps required to sort the given input array.

Sample input:
1,1,1,1,0,0,0,0
output: 0

input:
1,1,1,1,0,1,0,1
output: 3

input:
1,0,1,0,0,0,0,1
output:6
*/

public class Solution{
    public static int minMoves(int[] avg){
        int count=0,swap=0,count1=0,swap1=0;
        for(int i=0; i<avg.length;i++){
          if(avg[i]==0){
            count++;
          }
          else{
            swap+=count;
          }
        }
        for(int i=0; i<avg.length;i++){
          if(avg[i]==1){
            count1++;
          }
          else{
            swap1+=count1;
          }
        }
        return Math.min(swap,swap1);
    }
}
