/*
The height of a binary tree is the number of edges between the tree's root and its furthest leaf. This means that a tree containing a single node has a height of .

Complete the getHeight function provided in your editor so that it returns the height of a binary tree. This function has a parameter, , which is a pointer to the root node of a binary tree. 
Note -The Height of binary tree with single node is taken as zero.

Input Format

You do not need to read any input from stdin. Our grader will pass the root node of a binary tree to your getHeight function.

Output Format

Your function should return a single integer denoting the height of the binary tree.

Sample Input

BST.png

Note: A binary search tree is a binary tree in which the value of each parent node's left child is less than the value the parent node, and the value of the parent node is less than the value of its right child.

Sample Output

3
Explanation

The longest root-to-leaf path is shown below:

Longest RTL.png

There are  nodes in this path that are connected by  edges, meaning our binary tree's . Thus, we print  as our answer.
*/


import java.util.*;
import java.io.*;
class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {
/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	static int height(Node root) {
      	// Write your code here.
        
        if ( root == null){
            return -1;
        }
        else{    
        
            int lheight = height(root.left);
            int rheight = height(root.right);
        
            if(lheight > rheight)
                return lheight+1 ;
            else
                return rheight+1 ;
        }    
    }
    
    public static Node insert(Node root, int data) {
        if(root == null){
            return new Node(data);
        }
        else {
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }
            else{
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0){
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        int height = height(root);
        System.out.println(height);
    }	
}
