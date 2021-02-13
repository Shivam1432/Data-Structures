/* class Node {
  int data;
  Node next;
  Node(){}
  Node(int d) {
    data=d;
  }
} */
class Result {
  static Node revAltKNodes (Node head, int k) {
		Node current = head; 
        Node next = null, prev = null; 
        int count = 0; 
        while (current != null && count < k) { 
            next = current.next; 
            current.next = prev; 
            prev = current; 
            current = next; 
            count++; 
        } 
        if (head != null) { 
            head.next = current; 
        } 
        count = 0; 
        while (count < k - 1 && current != null) { 
            current = current.next; 
            count++; 
        } 
        if (current != null) { 
            current.next = revAltKNodes(current.next, k); 
        } 
        return prev; 
  }
}
