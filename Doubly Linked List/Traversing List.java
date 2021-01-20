import java.util.Scanner;

public class TraversingList {
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
    
    public TraversingList()
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
    		System.out.println("List is empty");
    	}
    	Node temp=head;
    	while(temp!=null)
    	{
    		System.out.print(temp.data+" ");
    		temp=temp.next;
    	}
    }
    public void displayBackward()
    {
    	if(tail==null)
    	{
    		return;
    	}
    	Node temp=tail;
    	while(temp!=null)
    	{
    		System.out.print(temp.data+" ");
    		temp=temp.previous;
    	}
    }
    public static void main(String[] args)
    {
    	Scanner s=new Scanner(System.in);
    	int n,m;
    	TraversingList dll=new TraversingList();
    	n=s.nextInt();
    	while(n>0)
    	{
    		m=s.nextInt();
    		dll.insertEnd(m);
    		n--;
    	}
    	System.out.println("In forward direction: ");
    	dll.displayForward();
    	System.out.println();
    	System.out.println("In backward direction: ");
    	dll.displayBackward();
    	s.close();
    }
}
