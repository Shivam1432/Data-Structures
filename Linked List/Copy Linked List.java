
import java.util.Scanner;

class CopyLinkedList
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
    newLink.next = null;   
    if (head == null)  
    {
      head = newLink;
      return head;
    }
    while (last.next != null)  
      last = last.next;
    last.next = newLink;  
    return head;
  }

  static void forwardPrint(Node head)
  {
    Node current = head; 
    while(current != null) 
    {
      System.out.print(current.data + " "); 
      current = current.next; 
    }
  }
  

static Node copyList(Node org)
{
  Node current=org;
  Node c=org;
  Node h2=null;
  int count=0;
  while(current!=null)
  {
    current=current.next;
    count++;
  }
  while(count>0)
  {
    int m=c.data;
    h2=insertEnd(h2,m);
    c=c.next;
    count--;
  }
  return h2;
}
public static void main(String[] args)
  {
    int t,n,m;
    Scanner s = new Scanner(System.in);
    t=Integer.parseInt(s.nextLine());
    while(t>0)
    {
      Node head = null;
      Node h2 = null;
      n=Integer.parseInt(s.nextLine());
      while(n>0)
      {
        m=Integer.parseInt(s.nextLine());
        head = insertEnd(head, m);
        n--;
      }
      h2 = copyList(head);
      if(h2!=null && h2==head) System.out.print("Not allowed");
      else forwardPrint(h2);
      System.out.print("\n");
      t--;
      s.close();
    }
  }
}
