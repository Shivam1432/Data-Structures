import java.util.Scanner;

public class DeleteGivenPos {
	private static class Node{
    	int data;
    	Node next;
    	Node(int data)
    	{
    		this.data=data;
    	}
    }
    public static Node insertEnd(Node head,int data)
    {
    	Node newNode=new Node(data);
    	Node last=head;
    	newNode.next=null;
    	if(head==null)
    	{
    		return newNode;
    	}
    	while(last.next!=null)
    	{
    		last=last.next;
    	}
    	last.next=newNode;
    	return head;
    }
    public static void display(Node head) {
    	Node current=head;
    	if(head==null)
    	{
    		return ;
    	}
    	while(current!=null)
    	{
    		System.out.print(current.data+" -> ");
    		current=current.next;
    	}
    	System.out.print(current);
    	
    }
    static Node deleteAtPosition(Node head,int pos)
    {
 	   
 	   Node current=head;
 	   int length=0;
 	   while(current!=null)
 	   {
 		   current=current.next;
 		   length++;
 	   }
 	   if(pos<1 || pos>length)
 	   {
 		   System.out.println("Invalid Position");
 		   return head;
 	   }
 	   else
 	   {
 		   if(pos==1)
 		   {
 			   Node temp=head;
 			   head=head.next;
 			   temp.next=null;
 			   return head;
 		   }
 		   else {
 			   Node prev=head;
 			   int count=1;
 			   while(count<pos-1)
 			   {
 				   prev=prev.next;
 				   count++;
 			   }
 			   Node cur=prev.next;
 			   prev.next=cur.next;
 			   cur.next=null;
 			   return head;
 		   }
 		   
 	   }
    }
    public static void main(String[] args) {
    	int n,m;
        Node head=null;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        while(n>0)
        {
        	m=s.nextInt();
        	head=insertEnd(head,m);
        	n--;
        }
        int pos=s.nextInt();
        System.out.println("Before deleting node at position: "+pos);
        display(head);
        System.out.println();
        System.out.println("After deleting node at position: "+pos);
        head=deleteAtPosition(head,pos);
        display(head);
        s.close();
    }
    
}
