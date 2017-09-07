/*
Sample Input

NULL, data =  
 --> NULL, data = 

Sample Output

2 -->NULL
2 --> 3 --> NULL
Explanation 
1. We have an empty list, and we insert 2 . 
2. We start with a 2 in the tail. When 3 is inserted, 3 then becomes the tail.
*/

/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
Node Insert(Node head,int data) {
// This is a "method-only" submission. 
// You only need to complete this method. 
    Node temp=head;
    Node addtail = new Node();
    addtail.data = data;
    addtail.next = null;
    if (head == null){
        head = addtail;
        return head;
    }
    while( temp.next != null )
    {
        temp = temp.next;
    }
    temp.next = addtail;
      
    return head; 
}
