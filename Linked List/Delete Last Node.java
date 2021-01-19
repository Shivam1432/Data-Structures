
import java.util.Scanner;

	public class DeleteLastNode {
		private static class Node{
	    	int data;
	    	Node next;
	    	Node(int data)
	    	{
	    		this.data=data;
	    	}
	    }
	    public static Node insertEnd(Node head,int data)
	    {
	    	Node newNode=new Node(data);
	    	Node last=head;
	    	newNode.next=null;
	    	if(head==null)
	    	{
	    		return newNode;
	    	}
	    	while(last.next!=null)
	    	{
	    		last=last.next;
	    	}
	    	last.next=newNode;
	    	return head;
	    }
	    public static void display(Node head) {
	    	Node current=head;
	    	if(head==null)
	    	{
	    		return ;
	    	}
	    	while(current!=null)
	    	{
	    		System.out.print(current.data+" -> ");
	    		current=current.next;
	    	}
	    	System.out.print(current);
	    	
	    }
	    public static Node LastNode(Node head)
	    {
	    	if(head==null)
	    	{
	    		return head;
	    	}
	    	Node last=head;
	    	Node previousToLast=null;
	    	while(last.next!=null)
	    	{
	    		previousToLast=last;
	    		last=last.next;
	    	}
	    	previousToLast.next=null;
	    	return head;
	    }
	    public static void main(String[] args) {
	    	int n,m;
	        Node head=null;
	        Scanner s=new Scanner(System.in);
	        n=s.nextInt();
	        while(n>0)
	        {
	        	m=s.nextInt();
	        	head=insertEnd(head,m);
	        	n--;
	        }
	        System.out.println("Before deleting last node:");
	        display(head);
	        System.out.println();
	        System.out.println("After deleting last node:");
	        head=LastNode(head);
	        display(head);
	        s.close();
	    }
	}


