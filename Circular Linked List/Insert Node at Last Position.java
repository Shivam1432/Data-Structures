import java.util.Scanner;

public class InsertLast {
	private Node last;
    private int length;
    private Node head;
    
    private class Node{
    	private Node next;
    	private int data;
    	public Node(int data)
    	{
    		this.data=data;
    	}
    }
    
    public InsertLast()
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
    public void insertionAtLast(int key)
    {
    	Node temp=new Node(key);
    	if(last==null)
    	{
    		last=temp;
    		last.next=last;
    	}
    	else
    	{
    		temp.next=last.next;
    		last.next=temp;
    		last=temp;
    	}
    	length++;
    }
    public static void main(String[] args) {
		// TODO Auto-generated method stub
        InsertLast cll=new InsertLast();
        Scanner s=new Scanner(System.in);
        int n;
        n=s.nextInt();
        while(n>0)
        {
           int m=s.nextInt();
           cll.add(m);
           n--;
        }
        int key;
        key=s.nextInt();
		
        cll.display();
        System.out.println();
        System.out.println("After insertion at last node: ");
        cll.insertionAtLast(key);
        cll.display();
        s.close();
	}
}
