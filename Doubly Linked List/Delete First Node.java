import java.util.Scanner;

public class DeleteFirstNode {
	private Node head;
    private Node tail;
    private int length;
    
    private class Node{
    	private Node next;
    	private Node previous;
    	private int data;
    	public Node(int data)
    	{
    		this.data=data;
    	}
    }
    
    /*constructor*/
    public DeleteFirstNode()
    {
    	this.head=null;
    	this.tail=null;
    	this.length=0;
    }
    
    public boolean isEmpty()
    {
    	return length==0;
    }
    
    public int length()
    {
    	return length;
    }
    
    public void insertEnd(int value)
    {
    	Node newNode=new Node(value);
    	if(isEmpty())
    	{
    		head=newNode;
    	}
    	else
    	{
    		tail.next=newNode;
    	}
    	newNode.previous=tail;
    	tail=newNode;
    	length++;
    }
    
    public void displayForward()
    {
    	if(head==null)
    	{
    		return;
    	}
    	Node temp=head;
    	while(temp!=null)
    	{
    		System.out.print(temp.data+" ");
    		temp=temp.next;
    	}
    }
    public void deleteFirst()
    {
    	if(isEmpty())
    	{
    		System.out.println("Cannot delete node from empty list");
    	}
    	else
    	{
    		Node temp=head;
    		if(head==tail)
    		{
    			tail=null;
    		}
    		else
    		{
    			head.next.previous=null;
    		}
    		head=head.next;
    		temp.next=null;
    		length--;
    	}
    }
    public static void main(String[] args)
    {
    	Scanner s=new Scanner(System.in);
    	int n,m;
    	DeleteFirstNode dll=new DeleteFirstNode();
    	n=s.nextInt();
    	while(n>0)
    	{
    		m=s.nextInt();
    		dll.insertEnd(m);
    		n--;
    	}
    	
    	dll.displayForward();
    	System.out.println();
    	System.out.println("After deleting first node: ");
    	dll.deleteFirst();
    	dll.displayForward();
    	System.out.println();
    	s.close();
    }
}
