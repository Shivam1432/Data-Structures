import java.util.Scanner;


public class InsertAtPos {
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
    
    public InsertAtPos()
    {
    	head=null;
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
    public void insertionAtPos(int value,int pos)
    {
    	if(isEmpty())
    	{
    		System.out.println("List is Empty");
    	}
    	if(pos<1 || pos>length+1)
  	   {
  		   System.out.println("Invalid Position");
  		   return;
  	   }
  	   else
  	   {
  		   Node temp=new Node(value);
  		   if(pos==1)
  		   {
  			 if(last==null)
  	    	 {
  	    	 	last=temp;
  	    	 }
  	    	 else
  	    	 {
  	    		temp.next=last.next;
  	    	 }
  	    	 last.next=temp;
  			 length++;
  		   }
  		   else if(pos==length+1)
  		   {
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
  		   else 
  		   {
  			 Node prev=last.next;
  		     int count=1;
  		     while(count<pos-1)
  		     {
  			     prev=prev.next;
  			     count++;
  		     }
  		     Node c=prev.next;
  		     temp.next=c;
  		     prev.next=temp;
  		     length++;
  		   }
  	   }
    }
    public static void main(String[] args) {
		// TODO Auto-generated method stub
        InsertAtPos cll=new InsertAtPos();
        Scanner s=new Scanner(System.in);
        int n;
        n=s.nextInt();
        while(n>0)
        {
           int m=s.nextInt();
           cll.add(m);
           n--;
        }
        System.out.println("Enter position: ");
        int pos;
        pos=s.nextInt();
        System.out.println("Enter element: ");
		int key;
		key=s.nextInt();
        cll.display();
        System.out.println();
        System.out.println("After inserting node "+key+" at postion: "+pos);
        cll.insertionAtPos(key,pos);
        cll.display();
        s.close();
	}
}
