import java.util.Scanner;


public class DeletionAtGivenPos {
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
    public DeletionAtGivenPos()
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
    public void deleteNode(int pos)
    {
    	if(pos<1 || pos>length)
    	{
    		System.out.println("Enter valid position");
    		return;
    	}
    	else
    	{
    		if(isEmpty())
        	{
        		System.out.println("Cannot delete node from empty list");
        	}
    		if(pos==1)
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
        	else
        	{
        		Node temp=head;
        		int count=1;
        		while(count<pos-1)
        		{
        			temp=temp.next;
        			count++;
        		}
        		Node current=temp.next;
        		temp.next=current.next;
        		current.next.previous=temp;
        		current.previous=null;
        		current.next=null;
        	}
    	}
    }
    public static void main(String[] args)
    {
    	Scanner s=new Scanner(System.in);
    	int n,m;
    	DeletionAtGivenPos dll=new DeletionAtGivenPos();
    	n=s.nextInt();
    	while(n>0)
    	{
    		m=s.nextInt();
    		dll.insertEnd(m);
    		n--;
    	}
    	int pos;
    	System.out.println("Enter position: ");
    	pos=s.nextInt();
    	dll.displayForward();
    	System.out.println();
    	System.out.println("After deleting node at given pos: "+pos);
    	dll.deleteNode(pos);
    	dll.displayForward();
    	System.out.println();
    	s.close();
    }
}
