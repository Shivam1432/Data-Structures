/* enqueue(int) & dequeue() are available on queues.*/
class NewStack
{
  void push(QueueArray qa1, QueueArray qa2, int item)
  {
    qa2.enqueue(item);
  }

  int pop(QueueArray qa1, QueueArray qa2)
  {
    int n=qa2.rear+1;
  int[] st=new int[n];
  int top=-1;
    if(qa2.front!=-1 || qa2.front<=qa2.rear)
    {
      while(qa2.rear>=qa2.front)
  {
    st[++top]=qa2.dequeue();
  }
  while(top>=0)
  {
    int temp=st[top];
    qa1.enqueue(temp);
    top--;
  }
  int x=qa1.dequeue();
   while(qa1.rear>=qa1.front)
   {
       int t=qa1.dequeue();
       qa2.enqueue(t);
   }
   return x;
  }
    return -1;
  }
}
