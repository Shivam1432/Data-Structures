import java.util.NoSuchElementException;
import java.util.Scanner;

public class QueueArrays {
	private int SIZE;
	private int front;
	private int rear;
	private int array[];
	private int length;
	  
	  public QueueArrays(int size)
	  {
		  SIZE=size;
		  front=-1;
		  rear=-1;
		  length=0;
		  array=new int[SIZE];
	  }
      public boolean isEmpty()
      {
    	  return front==-1;
      }
      public int size()
      {
    	  return length;
      }
      public int front()
      {
    	  if(isEmpty() || front>rear)
    	  {
    		  throw new NoSuchElementException("Underflow Exception") ;
    	  }
    	  else
    	  {
    		  return array[front];
    	  }
      }
	  
	  void enqueue(int item)
	  {
	    if (rear == SIZE)   // Queue is full
	      return;
	    if(front == -1 && rear == -1){
	      front++;
	      rear++;
	    }
	    else
	      rear++;
	    array[rear] = item;
	    length++;
	    System.out.println(item+" enqueued to queue.");
	  }

	 
	  int dequeue()
	  {
	    if (front > rear || isEmpty())
	    {
	      System.out.println("Queue is Empty.");
	      return -1;
	    }
	    int item = array[front];
	    front++;
	    length--;
	    System.out.println(item+" dequeued from queue.");
	    return item;
	  }

	  public static void main(String args[])
	  {
	    Scanner s=new Scanner(System.in);
		System.out.println("Enter size of queue array:");  
	    int size=s.nextInt();
		QueueArrays ob1=new QueueArrays(size);
	    System.out.println("Front = "+ob1.front+ ", Rear = "+ob1.rear);
	    ob1.enqueue(10);
	    System.out.println("Front = "+ob1.front+ ", Rear = "+ob1.rear);
	    ob1.enqueue(20);
	    System.out.println("Front = "+ob1.front+ ", Rear = "+ob1.rear);
	    ob1.enqueue(30);
	    System.out.println("Front = "+ob1.front+ ", Rear = "+ob1.rear);
	    ob1.enqueue(40);
	    System.out.println("Front = "+ob1.front+ ", Rear = "+ob1.rear);
        int f=ob1.front();
        System.out.println("Front = "+f);
	    ob1.dequeue();
	    System.out.println("Front = "+ob1.front+ ", Rear = "+ob1.rear);
	    ob1.dequeue();
	    System.out.println("Front = "+ob1.front+ ", Rear = "+ob1.rear);
	    ob1.dequeue();
	    System.out.println("Front = "+ob1.front+ ", Rear = "+ob1.rear);
	    ob1.dequeue();
	    System.out.println("Front = "+ob1.front+ ", Rear = "+ob1.rear);
	    ob1.dequeue();
	    System.out.println("Front = "+ob1.front+ ", Rear = "+ob1.rear);
        
	    ob1.enqueue(50);
	    System.out.println("Front = "+ob1.front+ ", Rear = "+ob1.rear);
	    int l=ob1.size();
	    System.out.println("Number of objects in queue: "+l);
	    s.close();
	  }
}
