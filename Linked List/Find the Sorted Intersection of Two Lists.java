/* class Node {
  int data;
  Node next;
  Node(int d) {
    data=d;
  }
} */
import java.util.*;
class Result {
  public static Node sortedInsert(Node head, Node newNode)
    {
        Node dummy = new Node();
        Node current = dummy;
        dummy.next = head;
 
        while (current.next != null && current.next.data < newNode.data) {
            current = current.next;
        }
 
        newNode.next = current.next;
        current.next = newNode;
        return dummy.next;
    }
    public static Node InsertSort(Node head)
    {
        Node result = null;     // build the answer here
        Node current = head;    // iterate over the original list
        Node next;
 
        while (current != null)
        {
            // tricky: note the next reference before we change it
            next = current.next;
 
            result = sortedInsert(result, current);
            current = next;
        }
 
        return result;
    }
  static Node findIntersection(Node head1, Node head2) {
    Node dummy=new Node(0);
    Node curr=dummy;
    head1=InsertSort(head1);
    head2=InsertSort(head2);
    while(head1!=null && head2!=null)
    {
      if(head1.data==head2.data)
      {
        curr.next=new Node(head1.data);
        curr=curr.next;
        head1=head1.next;
        head2=head2.next;
      }
      else if(head1.data <head2.data)
      {
        head1=head1.next;
      }
      else
      {
        head2=head2.next;
      }
    }
    return (dummy.next);
  }
}
