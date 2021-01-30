/* 
class QueueArray
{
  static int SIZE=10;
  static int front=-1;
  static int rear=-1;
  static int array[]=new int[SIZE];
  void enqueue(int item);
  void dequeue();
  Abobe is the queue declaration.
*/
static void reverseQueue(QueueArray q)
{
  int n=q.rear;
  n++;
  int[] st=new int[n];
  int top=-1;
  while(q.rear>=q.front)
  {
    st[++top]=q.dequeue();
  }
  while(top>=0)
  {
    int temp=st[top];
    q.enqueue(temp);
    top--;
  }
  System.out.println();
}
