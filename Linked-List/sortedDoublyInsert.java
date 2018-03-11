/*
Given a reference to the head of a doubly-linked list and an integer, , create a new Node object having data value  and insert it into a sorted linked list.

Complete the Node* SortedInsert(Node* head, int data) method in the editor below. It has two parameters:

: A reference to the head of a doubly-linked list of Node objects.
: An integer denoting the value of the  field for the Node you must insert into the list.
The method must insert a new Node into the sorted (in ascending order) doubly-linked list whose data value is  without breaking any of the list's double links or causing it to become unsorted.

Note: Recall that an empty list (i.e., where ) and a list with one element are sorted lists.

Input Format

Do not read any input from stdin. Hidden stub code reads in the following sequence of inputs and passes and  to the method:

The first line contains an integer, , denoting the number of lists that will be checked. The  subsequent lines describe the elements to insert into each list over two lines:

The first line contains an integer, , denoting the number of elements that will be inserted into the list.
The second line contains  space-separated integers describing the respective data values that your code must insert into the list during each call to the method.
Output Format

Do not print anything to stdout. Your method must return a reference to the  of the same list that was passed to it as a parameter. The custom checker for this challenge checks the list to ensure it hasn't been modified other than to properly insert the new Node in the correct location.

Sample Input

1
3
2 5 4
Sample Output

2 4 5
Explanation

We start out with an empty list. We insert a node with . The list becomes . We return .
The head of the previously modified list is passed to our method as an argument. We insert a node with . The list becomes . We return .
The head of the previously modified list is passed to our method as an argument. We insert a node with . The list becomes . We return .
Hidden stub code then prints the final list as a single line of space-separated integers.
*/


/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
     Node prev;
  }
*/

Node SortedInsert(Node head,int data) {
     Node insert = new Node();
     insert.data = data;
     insert.prev = null;
     insert.next = null;
     if(head == null){
         head = insert;
         return head;
     } 
     Node node = head, prevN = null;
    
         while(node!=null){
             if(node.data > data && node.prev == null){
                 node.prev = insert;
                 insert.next = node;
                 head = insert;
                 return head;
             }
             else if(node.data > data){
                 insert.prev = prevN;
                 prevN.next = insert;
                 node.prev = insert;
                 insert.next = node;   
                 return head;
             }
             else if(node.next == null){
                 insert.prev = node;
                 node.next = insert;
                 return head;
             }
             prevN = node;
             node = node.next;
         }
     
    return head;
}

