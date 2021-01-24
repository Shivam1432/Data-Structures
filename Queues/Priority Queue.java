
import java.util.*;
 
class PriorityQueue
{
	private static class QueueNode
	{
	  int data;
	  int priority;
	  QueueNode next;

	  public QueueNode(int data, int p) 
	  {
	    this.data = data;
	    this.priority = p;
	  }
	}
	public QueueNode front, rear;
  PriorityQueue()
  {
    front=null;
    rear=null;
  }
  public void EnQueue(int data, int priority)
  {
    QueueNode temp=new QueueNode(data,priority);
    temp.next=null;
    QueueNode start=front;
    if(rear==null)
    {
      front=rear=temp;
      return;
    }
    if(front.priority>priority)
    {
      temp.next=front;
      front=temp;
    }
    else{
      while(start.next!=null && start.next.priority<priority)
      {
        start=start.next;
      }
      if(start.next==null)
      {
        start.next=temp;
        rear=temp;
        return;
      }
      temp.next=start.next;
      start.next=temp;
    }
    return;
  }    

  public int DeQueue()
  {
    if (front == null)
	      return -1;
	    
	    int temp = front.data;
	    front = front.next;

	    
	    if (front == null)
	      rear = null;
	    return temp;
    
  }

  public static void main(String[] args)
  {
    PriorityQueue q=new PriorityQueue();
    Scanner s=new Scanner(System.in);
    int n, q1, q2, q3;
      n = s.nextInt();
      while(n>0)
      {
        q1 = s.nextInt();
        if(q1 == 1)
        {
          q2 = s.nextInt();
          q3 = s.nextInt();
          q.EnQueue(q2, q3);
        }
        else
          System.out.print(q.DeQueue() + " ");
        n--;
      }
      System.out.println();
      s.close();
  }
  
}
