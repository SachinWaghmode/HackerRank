/*
Insert node into Cyclic ordered LinkedList
Example:
        1
      /   \
     50   15
      \   /
        22
*/
public static void insertNodeSorted(Node node, int value){
       
        Node head = node;
        if (node == null) {
            node = new Node(x);
            node.next = node;
            return node;
        }
        if (node.next == head) {
            insertNode(node, x);
            return head;
        }
        while (node != null && node.next != null) {
            if (node.val < node.next.val) {
                if (node.val <= x && x <= node.next.val) {
                    insertNode(node, x);
                    break;
                }
            } else if (node.val > node.next.val) {
                if (x >= node.val || x <= node.next.val) {
                    insertNode(node, x);
                    break;
                }
            } else {
                if (node.next == head) {
                    insertNode(node, x);
                    break;
                }
            }
            node = node.next;
        }
        return head;
    }

    public void insertNode(Node head, int x) {
        Node node = new Node(x);
        node.next = head.next;
        head.next = node;
    }


