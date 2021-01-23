import java.util.Scanner;

public class DeleteFirst {
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
    
    public DeleteFirst()
    {
    	last=null;
    	head=null;
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
    public void deletionAtFirst()
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
    			last.next=temp.next;
    		}
    		temp.next=null;
    		length--;
    	}
    }
    public static void main(String[] args) {
		// TODO Auto-generated method stub
        DeleteFirst cll=new DeleteFirst();
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
        System.out.println("After deleting first node: ");
        cll.deletionAtFirst();
        cll.display();
        s.close();
	}
}
