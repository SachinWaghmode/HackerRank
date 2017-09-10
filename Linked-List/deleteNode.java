/*
Sample Input

1 --> 2 --> 3 --> NULL, position = 0 
1 --> NULL , position = 0

Sample Output

2 --> 3 --> NULL
NULL
Explanation 
1. 0th position is removed, 1 is deleted from the list. 
2. Again 0th position is deleted and we are left with empty list.
*/

/*
  Delete Node at a given position in a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

Node Delete(Node head, int position) {
  // Complete this method
    Node temp = head;
    if (temp == null)
        return head;
    else if (position == 0 )
        return temp.next;                     //Delete head node
    
    while( temp.next != null)
    {
        position--;
        if( position <= 0)
        {
            Node del = temp.next;            //Delete node in between
            temp.next = temp.next.next;
            del.next = null;
            return head;
        }
        else if(temp.next.next == null)
        {
            temp.next = null;                //Delete tail node
            return head;
        }
        
        temp = temp.next;
    }
    return head;
}
