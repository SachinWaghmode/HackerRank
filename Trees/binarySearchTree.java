/*
Code pair Problem:
Each node of a Binary Search Tree (BST) has an integer value and pointers to as many as two children. The children of a parent node are referred to as the left child and the right child. The value of left child is always less than the value of its parent node, and the value of right child is always greater than or equal to the value of its parent node.

 

Function Description

Complete the isPresent function in your editor below.  It should return 1 if the value is present int the BST, or 0 if it's not.

 

isPresent has the following parameters:

- root: reference to the root node of a BST 

- val: the integer value to search for

 

Constraints

1 ≤ total nodes ≤ 105
1 ≤ val ≤ 5 × 104
Input Format for Custom Testing
Input from stdin will be processed as follows and passed to the function:

 

Each line contains an integer to search for in the given BST.

Sample Case 0
Sample Input 0
<img width="246" alt="screen shot 2018-03-08 at 2 07 23 pm" src="https://user-images.githubusercontent.com/25470880/37179331-236ffd6a-22da-11e8-9af2-b75ca7e55687.png">



 

Values

30
10
12
15
 

Sample Output 0

1
1
1
0
 

Explanation

Value: 30. This value is present in the BST, so isPresent returns 1.

Value: 10. This value is present in the BST, so isPresent returns 1.

Value: 12. This value is present in the BST, so isPresent returns 1.

Value: 15. This value is not present in the BST, so isPresent returns 0.

 

Sample Case 1
Sample Input 1

<img width="246" alt="screen shot 2018-03-08 at 2 07 23 pm" src="https://user-images.githubusercontent.com/25470880/37179331-236ffd6a-22da-11e8-9af2-b75ca7e55687.png">


 

Values

79
10
20
30
40
 

Sample Output 1

0
1
1
1
1
 

Explanation

Value: 79. This value is not present in the BST, so isPresent returns 0.

Value: 10. This value is present in the BST, so isPresent returns 1.

Value: 20. This value is present in the BST, so isPresent returns 1.

Value: 30. This value is present in the BST, so isPresent returns 1.

Value: 40. This value is present in the BST, so isPresent returns 1.
*/

import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;
public class Solution { 

	private static class Node {
		Node left, right;
		int data;

		Node(int newData) {
			left = right = null;
			data = newData;
		}
	}

	private static Node insert(Node node, int data) {
		if (node==null) {
			node = new Node(data);
		}
		else {
			if (data <= node.data) {
				node.left = insert(node.left, data);
			}
			else {
				node.right = insert(node.right, data);
			}
		}
		return(node);
	}

	public static void main(String [] args) throws Exception{ 
		Scanner in = new Scanner(System.in);
		Node _root;
		int root_i=0, root_cnt = 0, root_num = 0;
		root_cnt = in.nextInt();
 _root=null;
for(root_i = 0; root_i < root_cnt; root_i++){
        root_num = in.nextInt();
        if( root_i == 0)
          _root = new Node(root_num);
        else           
        	insert(_root, root_num);
}
	
        int q = in.nextInt();
        
        for (int i = 0; i < q; i++) {
		  int _x = in.nextInt();
		  System.out.println(isPresent(_root,_x));
        }
        
		return;
	}
private static int isPresent(Node root, int val){
/* For your reference
class Node {
		Node left, right;
		int data;
                Node(int newData) {
			left = right = null;
			data = newData;
		}
	}
*/


    if(root==null)
        return 0;
    if(root.data == val){
        return 1;
    }
    else if(root.left!=null && val < root.data){
        
      return isPresent(root.left, val);
    }
    else if(root.right!=null && val > root.data){
       return  isPresent(root.right, val);
    }
    else return 0;

  } 
}
