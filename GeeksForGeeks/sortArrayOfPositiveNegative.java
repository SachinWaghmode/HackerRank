/*
Rearrange positive and negative numbers with constant extra space
Given an array of positive and negative numbers, arrange them such that all negative integers appear before all the positive integers in the array without using any additional data structure like hash table, arrays, etc. The order of appearance should be maintained.

Examples:

Input:  [12 11 -13 -5 6 -7 5 -3 -6]
Output: [-13 -5 -7 -3 -6 12 11 6 5]
*/

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number of elements in: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] input = new int[n]; 
		 System.out.println("Enter element of an array: ");
		for (int i=0; i<n; i++){ 
		    input[i] = sc.nextInt();
		}
		System.out.print("Given Array :");
		for (int i=0; i<n; i++){ 
			System.out.print(" "+input[i]);
		}
		
		for(int i=1; i<n; i++){
			int toReplace = input[i];
			if(toReplace >= 0)        //continue until we find negative number
				continue;
			int j = i-1;
			while(j >=0 && input[j] >=0){
				input[j+1] = input[j];  //move positive number towards right
				j--;
			}
			input[j+1] = toReplace;   //put negative number to the left
		}
		
		System.out.print("\nResultant Array :");
		for (int i=0; i<n; i++){
		    System.out.print(" "+input[i]);
		     
		}

	}

}


/*bruteforce approach

import java.util.Scanner;

public class Solutionbruteforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number of elements in: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] input = new int[n]; 
		 System.out.println("Enter element of an array: ");
		for (int i=0; i<n; i++){ 
		    input[i] = sc.nextInt();
		}
		System.out.print("Given Array :");
		for (int i=0; i<n; i++){ 
			System.out.print(" "+input[i]);
		}
		
		for(int i=0; i<n-1; i++){
			int j=i;
			while(input[j] >= 0 && j<n-1){ 
				j++;   //move j pointer until number is negative
			}
			if(j==n-1 && input[j]>0)
			{
				continue;  // skip swapping if number is positive
			}
			else{
				while(i<j && j>= 1){     // move negative element towards left
					int temp = input[j-1];
					input[j-1] = input[j];
					input[j] = temp;
					j--;
				}
			}
			
		}
		System.out.print("\nResultant Array :");
		for (int i=0; i<n; i++){
		    System.out.print(" "+input[i]);
		     
		}
		
	}

}
*/
