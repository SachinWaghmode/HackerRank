/*
Code pair problem:
We define a redundant node in a singly-linked list to be a node whose data value matches with the data value of a previous node in the list. In other words, given node nodei containing data value di, some node nodej (where i < j) having data value dj is redundant if di = dj. For example, consider the following linked list with one redundant node:

PS Example
A zero-indexed list in the form list = [3, 4, 3, 6] with a redundant node at index 2.
Complete the distinct function in the editor below. It has one parameter: a LinkedListNode, head, referencing the first node of a singly-linked list of integers. The function must return a LinkedListNode referencing the first node of a list that contains only the non-redundant nodes from the original list (and none of the redundant ones). All non-redundant nodes must be in the same exact order as they were in the original list.

Input Format

The first line contains an integer, n, denoting the number of elements in list.
Each line i of the n subsequent lines (where 0 ≤ i < n) contains an integer, di, describing the data value of the ith node in the list.
Constraints

1 ≤ n ≤ 105
0 ≤ di ≤ 1000
Output Format

Return a LinkedListNode referencing the first node of a list of the non-redundant nodes. The non-redundant nodes must be in the same order as in the initial list.

Sample Case 0
Sample Input

8
3
4
3
2
6
1
2
6
Sample Output

3
4
2
6
1
Explanation

The list head = 3 → 4 → 3 → 2 → 6 → 1 → 2 → 6 → null looks like this:

Sample Case Initial
The linked list given as input.
From the diagram, we conclude the following:

list2 = 3 is redundant to list0 = 3 because both nodes have matching data values and list2 appears later in the list.
list6 = 2 is redundant to list3 = 2 because both nodes have matching data values and list6 appears later in the list.
list7 = 6 is redundant to list4 = 6 because both nodes have matching data values and list7 appears later in the list.
After removing all the non-redundant nodes, the list looks like this:

Sample Case Reduced
The reduced list.
We then return a LinkedListNode referencing head = 3 → 4 → 2 → 6 → 1 → null, which both preserves the initial ordering of all non-redundant nodes and does not contain any redundant nodes.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static class LinkedListNode {
        int val;
        LinkedListNode next;

        LinkedListNode(int node_value) {
            val = node_value;
            next = null;
        }
    };

    public static LinkedListNode _insert_node_into_singlylinkedlist(LinkedListNode head, LinkedListNode tail, int val) {
        if(head == null) {
            head = new LinkedListNode(val);
            tail = head;
        }
        else {
            tail.next = new LinkedListNode(val);
            tail = tail.next;
        }
        return tail;
    }

    /*
     * Complete the function below.
     */
    /*
    For your reference:
    LinkedListNode {
        int val;
        LinkedListNode next;
    };
    */
    static LinkedListNode distinct(LinkedListNode head) {
        
        LinkedListNode temp = head;
        LinkedListNode prev = null;
        HashSet<Integer> node = new HashSet<>();
        while(temp.next!=null){
            if(node.contains(temp.val)){
                prev.next = temp.next;
            }
            else{
                node.add(temp.val);
                prev = temp;
            }
            temp = temp.next;
        }
        if(node.contains(temp.val)) prev.next = null;
        return head;
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

        LinkedListNode res;
        int head_size = 0;

        LinkedListNode head = null;
        LinkedListNode head_tail = null;

        head_size = Integer.parseInt(in.nextLine());

        for(int i = 0; i < head_size; i++) {
            int head_item;
            head_item = Integer.parseInt(in.nextLine().trim());
            head_tail = _insert_node_into_singlylinkedlist(head, head_tail, head_item);

            if(i == 0) {
                head = head_tail;
            }
        }


        res = distinct(head);
        while (res != null) {
            bw.write(String.valueOf(res.val));
            bw.newLine();
        res = res.next;
        }

        bw.close();
    }
}
