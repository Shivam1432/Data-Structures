import java.util.Scanner;

public class SearchNode {
	private Node last;
    private Node head;
    private int length;
    
    private class Node{
    	private Node next;
    	private int data;
    	public Node(int data)
    	{
    		this.data=data;
    	}
    }
    
    public SearchNode()
    {
    	last=null;
    	length=0;
    }
    public int length()
    {
    	return length;
    }
    public boolean isEmpty()
    {
    	return length==0;
    }
    public void add(int data){  
        Node newNode = new Node(data);    
        if(head == null) {    
            head = newNode;  
            last = newNode;  
            newNode.next = head; 
            length++;
        }  
        else {   
            last.next = newNode;   
            last = newNode;  
            last.next = head;  
            length++;
        }  
    }
    public void display()
    {
    	if(last==null)
    	{
    		return;
    	}
    	Node first=last.next;
    	while(first!=last)
    	{
    		System.out.print(first.data+" ");
    		first=first.next;
    	}
    	System.out.print(first.data);
    }
    public int SearchNodeAt(int key)
    {
    	if(head==null)
    	{
    		return 0;
    	}
    	int count=0;
    	Node current=last.next;
    	while(current.next!=last)
    	{
    		count++;
    		if(current.data == key)
    		{
    			return count;
    		}
    		current=current.next;
    	}
    	if(key==last.data)
    	{
    		return length;
    	}
    	return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        SearchNode cll=new SearchNode();
        Scanner s=new Scanner(System.in);
        int n;
        n=s.nextInt();
        while(n>0)
        {
           int m=s.nextInt();
           cll.add(m);
           n--;
        }
        int key=s.nextInt();
        int h;
        h=cll.SearchNodeAt(key);
        cll.display();
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
