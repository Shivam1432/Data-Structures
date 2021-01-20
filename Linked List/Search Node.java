import java.util.Scanner;

public class SearchNode {
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
   static int SearchNodeAt(Node head,int key)
    {
    	if(head==null)
    	{
    		return 0;
    	}
    	int count=0;
    	Node current=head;
    	while(current!=null)
    	{
    		count++;
    		if(current.data == key)
    		{
    			return count;
    		}
    		current=current.next;
    	}
    	return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
        int key=s.nextInt();
        int h;
        h=SearchNodeAt(head,key);
        display(head);
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
