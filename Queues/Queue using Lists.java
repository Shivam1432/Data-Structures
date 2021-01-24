import java.util.*;

public class QueueLinkedList {
	private static class QueueNode
	{
	  int data;
	  QueueNode next;

	  public QueueNode(int data) 
	  {
	    this.data = data;
	    this.next = null;
	  }
	}
	protected QueueNode front, rear;
	  
	  public QueueLinkedList()
	  {
	    front = rear = null;
	  }    

	  
	  public void EnQueue(int data)
	  {
	    QueueNode temp = new QueueNode(data);
	    System.out.println(data+" EnQueueed to Queue.");
	    if (rear == null)
	    {
	      front = rear = temp;
	      System.out.println("Front = "+front.data+", Rear = "+rear.data);
	      return;
	    }
	    rear.next = temp;
	    rear = temp;
	    System.out.println("Front = "+front.data+", Rear = "+rear.data);
	  }    

	  
	  public int DeQueue()
	  {
	    
	    if (front == null)
	      throw new NoSuchElementException("Underflow Exception") ;
	    
	    int temp = front.data;
	    front = front.next;

	    
	    if (front == null)
	      rear = null;
	    System.out.println(temp+" DeQueueed from Queue.");
	    System.out.println("Front = "+front.data+", Rear = "+rear.data);
	    return temp;
	  }
	  public static void main(String[] args)
	  {
	    QueueLinkedList ls = new QueueLinkedList();
	    ls.EnQueue(12);
	    ls.EnQueue(23);
	    try
	    {
	      ls.DeQueue();
	    }
	    catch (Exception e)
	    {
	      System.out.println(e.getMessage());
	    }    
	    ls.EnQueue(54);
	    try
	    {
	      ls.DeQueue();
	    }
	    catch (Exception e)
	    {
	      System.out.println(e.getMessage());
	    }    
	    try
	    {
	      ls.DeQueue();
	    }
	    catch (Exception e)
	    {
	      System.out.println(e.getMessage());
	    }    
	    try
	    {
	      ls.DeQueue();
	    }
	    catch (Exception e)
	    {
	      System.out.println(e.getMessage());
	    }    
	  }
}
