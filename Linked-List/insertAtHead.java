/*
Sample Input

NULL , data = 1 
1 --> NULL , data = 2

Sample Output

1 --> NULL
2 --> 1 --> NULL
Explanation 
1. We have an empty list, on inserting 1, 1 becomes new head. 
2. We have a list with 1 as head, on inserting 2, 2 becomes the new head.
*/

/*
  Insert Node at the beginning of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
// This is a "method-only" submission. 
// You only need to complete this method. 

Node Insert(Node head,int x) {
    Node addHead = new Node();
    addHead.data = x;
    if ( head == null){
        addHead.next = null;
        head = addHead;
        return head;
    }
    else{
        addHead.next = head;
        head = addHead;
        return head;
    }      
}
