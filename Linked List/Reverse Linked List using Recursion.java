import java.util.Scanner;

public class ReverseLinkedListRecursion {
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
	static void display(Node head)
	{
	  Node current=head;
	  while(current!=null)
	  {
	    System.out.print(current.data+"-");
	    current=current.next;
	  }
	}
	static Node reverse(Node head) { 
        if(head == null) { 
            return head; 
        } 
  
        // last node or only one node 
        if(head.next == null) { 
            return head; 
        } 
  
        Node newHeadNode = reverse(head.next); 
  
        // change references for middle chain 
        head.next.next = head; 
        head.next = null; 
  
        // send back new head node in every recursion 
        return newHeadNode; 
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
	      head=reverse(head);
	      display(head);
	      System.out.print("\n");
	      s.close();
		}
}
