import java.util.Scanner;

public class InsertionAtFirstNode {
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
	    public InsertionAtFirstNode()
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
	    public void insertFirst(int value)
	    {
	    	Node newNode=new Node(value);
	    	if(isEmpty())
	    	{
	    		tail=newNode;
	    	}
	    	else
	    	{
	    		head.previous=newNode;
	    	}
	    	newNode.next=head;
	    	head=newNode;
	    	length++;
	    }
	    public static void main(String[] args)
	    {
	    	Scanner s=new Scanner(System.in);
	    	int n,m;
	    	InsertionAtFirstNode dll=new InsertionAtFirstNode();
	    	n=s.nextInt();
	    	while(n>0)
	    	{
	    		m=s.nextInt();
	    		dll.insertEnd(m);
	    		n--;
	    	}
	    	int key;
	    	System.out.println("Enter element to prepend: ");
	    	key=s.nextInt();
	    	dll.insertFirst(key);
	    	System.out.println("In forward direction: ");
	    	dll.displayForward();
	    	System.out.println();
	    	s.close();
	    }
}
