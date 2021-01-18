
public class StacksLinkedList {
      private Node top;
      private int length;
      
      private class Node{
    	  private int data;
    	  private Node next;
    	  
    	  public Node(int data)
    	  {
    		  this.data=data;
    	  }
      }
      public StacksLinkedList() {
    	  top=null;
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
      public void push(int data)
      {
    	  Node temp=new Node(data);
    	  temp.next=top;
    	  top=temp;
    	  length++;
      }
      public int pop()
      {
    	  if(isEmpty())
    	  {
    		  System.out.println("Stack is empty");
    		  return 0;
    	  }
    	  int result=top.data;
    	  System.out.println(result + " popped from stack");
    	  top=top.next;
    	  System.out.println("Top is now at " + top.data);
    	  length--;
    	  return result;
      }
      public int peek()
      {
    	  if(isEmpty())
    	  {
    		  System.out.println("Stack is empty");
    		  return 0;
    	  }
    	  System.out.println(top.data+" is at top");
    	  return top.data;
      }
      public static void main(String[] args)
      {
    	  StacksLinkedList stack=new StacksLinkedList();
    	  stack.push(1);
    	  stack.push(2);
    	  stack.push(3);
    	  int temp;
    	  temp=stack.pop();
    	  temp=stack.pop();
    	  stack.push(4);
    	  temp=stack.peek();
      }
}
