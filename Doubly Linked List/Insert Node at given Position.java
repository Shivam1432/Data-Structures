import java.util.Scanner;


public class SearchNode {
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
    public SearchNode()
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
    public int SearchNodeAt(int key)
    {
    	if(isEmpty())
    	{
    		return 0;
    	}
    	else
    	{
    		Node temp=head;
    		int count=0;
    		while(temp!=null)
    		{
    			count++;
    			if(temp.data==key)
    			{
    				return count;
    			}
    			temp=temp.next;
    		}
    		return -1;
    	}
    }
    public static void main(String[] args)
    {
    	Scanner s=new Scanner(System.in);
    	int n,m;
    	SearchNode dll=new SearchNode();
    	n=s.nextInt();
    	while(n>0)
    	{
    		m=s.nextInt();
    		dll.insertEnd(m);
    		n--;
    	}
    	int key;
    	System.out.println("Enter element: ");
    	key=s.nextInt();
    	int h;
        h=dll.SearchNodeAt(key);
        dll.displayForward();
        System.out.println();
        if(h==0)
        {
        	System.out.println("List is empty");
        }
        else if(h==-1)
        {
        	System.out.println("Node not found in list");
        }
        else
        {
        	System.out.println("Node found at position: "+h);
        }
    	s.close();
    }
}
