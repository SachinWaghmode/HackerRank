/*
Code pair problem

Complete the removeNodes function provided in your editor. It has 2 parameters:

 

listHead: A reference to a LinkedListNode that is the head of a linked list.
x: An integer value.
 

Your function should remove all nodes from the list having data values greater than x, and then return the head of the modified linked list.

 

Input Format

The locked stub code in your editor processes the following inputs and passes the necessary arguments to the removeNodes function:

The first line contains N, the number of nodes in the linked list.

Each line i (where 0 ≤ i < N) of the N subsequent lines contains an integer representing the value of a node in the linked list. The last line contains an integer, x.

 

Constraints

1 ≤ N, x ≤ 105
1 ≤ Linked list node values ≤ 105
 

Output Format

Return the linked list after removing the nodes containing values > x.

 

Sample Input 1

5
1
2
3
4
5
3
 

Sample Output 1

1
2
3
 

Sample Input 2

5
5
2
1
6
7
5
 

Sample Output 2

5
2
1
 

Explanation

Sample Case 1:

N = 5, x = 3

list = 1 → 2 → 3 → 4 → 5

After removing the nodes having value > 3, list = 1 → 2 → 3.

 

Sample Case 2:

N = 5, x = 5

list = 5 → 2 → 1 → 6 → 7.

After removing the nodes having value > 5, list = 5 → 2 → 1.
*/

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
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
        if (head == null) {
            head = new LinkedListNode(val);
            tail = head;
        } else {
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
    static LinkedListNode removeNodes(LinkedListNode listHead, int x) {
        // Write your code here.
        if (listHead == null) return listHead;
        boolean flag =false;
    LinkedListNode temp = listHead;
    LinkedListNode prev = null;
    while(listHead!=null){
        
        if(listHead.val > x && listHead.next!=null && prev != null){
            prev.next = listHead.next;
        }
        else if(listHead.val <= x ){
            if (!flag) temp = listHead;
            prev = listHead;
            flag = true;
        }
        else{
            LinkedListNode remove = listHead;
            remove.next = null;
        }
        listHead = listHead.next;
    }
    prev.next =null;
    return temp;

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        if (bw == null) {
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        int listHeadSize = Integer.parseInt(scan.nextLine().trim());

        LinkedListNode listHead = null;
        LinkedListNode listHeadTail = null;

        for (int listHeadItr = 0; listHeadItr < listHeadSize; listHeadItr++) {
            int listHeadItem = Integer.parseInt(scan.nextLine().trim());
            listHeadTail = _insert_node_into_singlylinkedlist(listHead, listHeadTail, listHeadItem);

            if (listHeadItr == 0) {
                listHead = listHeadTail;
            }
        }

        int x = Integer.parseInt(scan.nextLine().trim());

        LinkedListNode res = removeNodes(listHead, x);

        while (res != null) {
            bw.write(String.valueOf(res.val));

            if (res.next != null) {
                bw.write("\n");
            }

            res = res.next;
        }

        bw.newLine();

        bw.close();
    }
}
