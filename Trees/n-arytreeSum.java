/*
Print Sum of same level nodes in a tree

Sample input: 
                       3
                     / | \ 
                    1  5  10
                   /  /  \  \
                  7  4    3   8
                  
Output:
        3,16,22
*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class narySum {

	public static void main(String[] args){
		TreeNode root = new TreeNode();
		root.val = 3;
		TreeNode node1 = new TreeNode();
		TreeNode node2 = new TreeNode();
		TreeNode node3 = new TreeNode();
		TreeNode node4 = new TreeNode();
		TreeNode node5 = new TreeNode();
		TreeNode node6 = new TreeNode();
		TreeNode node7 = new TreeNode();
		node1.val = 1;
		node2.val = 5;
		node3.val = 10;
		node4.val = 7;
		node5.val = 4;
		node6.val = 3;
		node7.val = 8;
		List<TreeNode> level1 = new ArrayList<>();
		level1.add(node1);
		level1.add(node2);
		level1.add(node3);
		root.children = level1;
		List<TreeNode> level21 = new ArrayList<>();
		level21.add(node4);
		node1.children =level21;
		List<TreeNode> level22 = new ArrayList<>();
		level22.add(node5);
		level22.add(node6);
		node2.children =level22;
		List<TreeNode> level23 = new ArrayList<>();
		level23.add(node7);
		node3.children =level23;
		
		List<Integer> result = printSum(root);
		for(int i=0; i<result.size(); i++){
			System.out.println(result.get(i));
		}
	}
	
	public static List<Integer> printSum(TreeNode root){
		List<Integer> result = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()){
			int n = queue.size();
			int sum=0;
			while(n>0){
				TreeNode node = queue.remove();
				sum+= node.val;
				if(node.children!=null){
					List<TreeNode> children = node.children;
					queue.addAll(children);
				}
				n--;
			}
			result.add(sum);
		}
		return result;
	}
}

class TreeNode{
	int val;
	List<TreeNode> children;
	
}
