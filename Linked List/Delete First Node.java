import java.util.Scanner;

public class DeleteFirstNode {
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
    public static Node FirstNode(Node head)
    {
    	if(head==null)
    	{
    		return head;
    	}
    	Node temp=head;
    	head=head.next;
    	temp.next=null;
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
        System.out.println("Before deleting first node:");
        display(head);
        System.out.println();
        System.out.println("After deleting first node:");
        head=FirstNode(head);
        display(head);
        s.close();
    }
}
