/* class Node {
  int data;
  Node next;
  Node(){}
  Node(int d) {
    data=d; next=null;
  }
} */
class Result {
  static Node reverseList(Node head) {
    Node current=head;
    Node previous=null;
    Node next=null;
    while(current!=null)
    {
      next=current.next;
      current.next=previous;
      previous=current;
      current=next;
    }
    head=previous;
    return head;
  }
}
