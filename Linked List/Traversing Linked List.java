
import java.util.Scanner;
// Other imports go here
// Do NOT change the class name

class Main
{
	private static class Node
	{
	  int data;
	  Node next;
	  Node(int d)
	  {
	    data=d;
	  }
	}

	static Node insertEnd(Node head, int data)
  {
    Node newLink = new Node(data);
    Node last = head;
    newLink.next = null;   // link new node to NULL as it is last node
    if (head == null)  // if list is empty add in beginning.
    {
      head = newLink;
      return head;
    }
    while (last.next != null)  // Find the last node
      last = last.next;
    last.next = newLink;  // Add the node after the last node of list
    return head;
  }
  	/* class Node
{
  int data;
  Node next;
} */

static void forwardPrint(Node head)
{
  Node current=head;
  while(current!=null)
  {
    System.out.print(current.data+"-");
    current=current.next;
  }
}

static void backwardPrint(Node head)
{ 
  Node prev = null;
    Node current = head;
    Node next;
    while (current != null)
    {
        next  = current.next; 
        current.next = prev;  
        prev = current;
        current = next;
    }
  head=prev;
  Node cur=head;
  while(cur!=null)
  {
    System.out.print(cur.data+"-");
    cur=cur.next;
  }
}
	
	public static void main(String[] args) {
	int n,m;
    Scanner s = new Scanner(System.in);
      Node head = null;
      n = Integer.parseInt(s.nextLine());
      while(n > 0)
      {
        m = Integer.parseInt(s.nextLine());
        head =insertEnd(head, m);
        n--;
      }
      forwardPrint(head);
      System.out.print("\n");
      backwardPrint(head);
      System.out.print("\n");
      s.close();
	}


}
