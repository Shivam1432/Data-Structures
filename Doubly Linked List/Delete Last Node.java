import java.util.Scanner;

public class DeleteLastNode {
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
    public DeleteLastNode()
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
    public void deleteLast()
    {
    	if(isEmpty())
    	{
    		System.out.println("Cannot delete node from empty list");
    	}
    	else
    	{
    		Node temp=tail;
    		if(head==tail)
    		{
    			head=null;
    		}
    		else
    		{
    			tail.previous.next=null;
    		}
    		tail=tail.previous;
    		temp.previous=null;
    		length--;
    	}
    }
    public static void main(String[] args)
    {
    	Scanner s=new Scanner(System.in);
    	int n,m;
    	DeleteLastNode dll=new DeleteLastNode();
    	n=s.nextInt();
    	while(n>0)
    	{
    		m=s.nextInt();
    		dll.insertEnd(m);
    		n--;
    	}
    	
    	dll.displayForward();
    	System.out.println();
    	System.out.println("After deleting last node: ");
    	dll.deleteLast();
    	dll.displayForward();
    	System.out.println();
    	s.close();
    }
}
