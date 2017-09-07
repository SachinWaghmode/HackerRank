/*

Sample Input

This example uses the following two linked lists:

NULL  
1->2->3->NULL
 and  are the two head nodes passed as arguments to Print(Node* head).

Note: In linked list diagrams, -> describes a pointer to the next node in the list.

Sample Output

1
2
3
Explanation

Test Case 0: NULL. An empty list is passed to the method, so nothing is printed. 
Test Case 1: 1->2->3->NULL. This is a non-empty list so we loop through each element, 
printing each element's data field on its own line.

*/

/*
  Print elements of a linked list on console 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

// This is a "method-only" submission. 
// You only need to complete this method. 
    
void Print(Node head) {
  if (head == null)
      return;
  while ( head != null )
  {
      System.out.println(head.data);
      head = head.next;
  }
  
}
