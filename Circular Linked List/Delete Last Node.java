import java.util.Scanner;

public class DeleteLast {
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
    
    public DeleteLast()
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
    public void deletionAtLast()
    {
    	if(isEmpty())
    	{
    		System.out.println("List is Empty");
    	}
    	else
    	{
    		Node temp=last.next;
    		if(last.next==last)
    		{
    			last=null;
    			head=null;
    		}
    		else
    		{
    			Node l=temp;
    			while(temp.next!=last)
    			{
    				temp=temp.next;
    			}
    			last=temp;
    			last.next=l;
    			length--;
    		}
    	}
    }
    public static void main(String[] args) {
		// TODO Auto-generated method stub
        DeleteLast cll=new DeleteLast();
        Scanner s=new Scanner(System.in);
        int n;
        n=s.nextInt();
        while(n>0)
        {
           int m=s.nextInt();
           cll.add(m);
           n--;
        }
        cll.display();
        System.out.println();
        System.out.println("After deleting last node: ");
        cll.deletionAtLast();
        cll.display();
        s.close();
	}
}
