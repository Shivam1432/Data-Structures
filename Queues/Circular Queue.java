
public class CircularQueue {
	static int SIZE=10;
	  static int front=-1;
	  static int rear=-1;
	  static int array[]=new int[SIZE];

	  // Method to add an item to the queue.
	  void enqueue(int item)
	  {
	    if ((front == 0 && rear == SIZE-1) || (rear == (front-1)%(SIZE-1))) {  // Queue is full
	      System.out.println("Queue is FULL.");
	      return;
	    }
	    if(front == -1)	  // Insert first element
	    front = rear = 0;
	  else if (rear == SIZE-1 && front != 0)	  // insert the element back at starting of queue.
	    rear = 0;
	  else		  // insert the element normally
	    rear++;

	    array[rear] = item;
	    System.out.println(item+" enqueued to queue.");
	  }

	  // Method to remove an item from queue.
	  int dequeue()
	  {
	    if (front == -1)
	    {
	      System.out.println("Queue is Empty.");
	      return -1;
	    }
	    int item = array[front];
	    if (front == rear)
	      front = rear = -1;
	    else if (front == SIZE-1)
	      front = 0;
	    else
	      front++;
	    System.out.println(item+" dequeued from queue.");
	    return item;
	  }

	  public static void main(String args[])
	  {
	    CircularQueue ob1=new CircularQueue();
	    System.out.println("Front = "+front+ ", Rear = "+rear);
	    ob1.enqueue(10);
	    System.out.println("Front = "+front+ ", Rear = "+rear);
	    ob1.enqueue(20);
	    System.out.println("Front = "+front+ ", Rear = "+rear);
	    ob1.enqueue(30);
	    System.out.println("Front = "+front+ ", Rear = "+rear);
	    ob1.enqueue(40);
	    System.out.println("Front = "+front+ ", Rear = "+rear);

	    ob1.dequeue();
	    System.out.println("Front = "+front+ ", Rear = "+rear);
	    ob1.dequeue();
	    System.out.println("Front = "+front+ ", Rear = "+rear);
	    ob1.dequeue();
	    System.out.println("Front = "+front+ ", Rear = "+rear);
	    ob1.dequeue();
	    System.out.println("Front = "+front+ ", Rear = "+rear);
	    ob1.dequeue();
	    System.out.println("Front = "+front+ ", Rear = "+rear);

	    ob1.enqueue(50);
	    System.out.println("Front = "+front+ ", Rear = "+rear);
	  }
}
