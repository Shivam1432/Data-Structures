
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

public ListNode insertAtBeginning(ListNode head,int data) {
    	ListNode newNode=new ListNode(data);
    	if(head==null)
    		{return newNode;}
    	newNode.next=head;
    	head=newNode;
    	return head;			
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
      int key;
	    System.out.println("Enter element to prepend: ");
	    key=s.nextInt();
      head=insertAtBeginning(head,key);
      forwardPrint(head);
      System.out.print("\n");
      s.close();
	}


}
