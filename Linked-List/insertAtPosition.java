/*
Sample Input

NULL, data = 3, position = 0 
3 --> NULL, data = 4, position = 0

Sample Output

3 --> NULL
4 --> 3 --> NULL
Explanation 
1. we have an empty list and position 0. 3 becomes head. 
2. 4 is added to position 0, hence 4 becomes head.

Note 
For the purpose of evaluation the list has been initialised with a node with data=2. 
Ignore it, this is done to avoid printing empty lists while comparing output.
*/

/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    

Node InsertNth(Node head, int data, int position) {
   // This is a "method-only" submission. 
    // You only need to complete this method. 
    Node addNode = new Node();
    addNode.data = data;
    if ( head == null ){
        addNode.next = null;
        head = addNode;
        return head;
    }
    if (position == 0){                                    // insert node at head
        addNode.next = head;
        head = addNode;
        return head;
    }
    Node temp = head;
    while( temp != null)
    {
        position--;
        if (position <= 0 && temp.next != null){           // insert node in between
            addNode.next = temp.next;
            temp.next = addNode;
            return head;
        }
        else if (temp.next == null)                        // inser node at tail                   
        {
            addNode.next = null;
            temp.next = addNode;
            return head;
        }
        temp = temp.next;
    }
    return head;       
}
