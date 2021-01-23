import java.util.Scanner;

public class DeleteGivenPos {
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
    
    public DeleteGivenPos()
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
    public void deletionAtPos(int pos)
    {
    	if(isEmpty())
    	{
    		System.out.println("List is Empty");
    	}
    	if(pos<1 || pos>length)
  	   {
  		   System.out.println("Invalid Position");
  		   return;
  	   }
  	   else
  	   {
  		   if(pos==1)
  		   {
  			 Node temp=last.next;
     		 if(last.next==last)
     		 {
     			last=null;
     		 }
     		 else
     		 {
     			last.next=temp.next;
     		 }
     		 temp.next=null;
     		 length--;
  		   }
  		   else if(pos==length)
  		   {
  			 Node temp=last.next;
     		if(last.next==last)
     		{
     			last=null;
     			head=null;
     			length--;
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
  		   else 
  		   {
  			   Node prev=last.next;
  			   int count=1;
  			   while(count<pos-1)
  			   {
  				   prev=prev.next;
  				   count++;
  			   }
  			   Node cur=prev.next;
  			   prev.next=cur.next;
  			   cur.next=null;
  			   length--;
  		   }
  	   }
    }
    public static void main(String[] args) {
		// TODO Auto-generated method stub
        DeleteGivenPos cll=new DeleteGivenPos();
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
		
        cll.display();
        System.out.println();
        System.out.println("After deleting node at position: "+pos);
        cll.deletionAtPos(pos);
        cll.display();
        s.close();
	}
}
