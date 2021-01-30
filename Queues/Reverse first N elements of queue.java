/* 
class QueueArray
{
  int SIZE=50;
  int front=-1;
  int rear=-1;
  int array[]=new int[SIZE];
  void enqueue(int item);
  void dequeue();
  Abobe is the queue declaration.
*/
static void reverseKelementsQueue(QueueArray q, int K)
{
  int s=q.rear;
  s++;
  int n=K;
  int[] st=new int[n];
  int[] arr=new int[s-n];
  int top=-1;
  while(n>0)
  {
    st[++top]=q.dequeue();
    n--;
  }
  n=K;
  for(int i=0;i<s-n;i++)
  {
    arr[i]=q.dequeue();
  }
  n=K;
  while(top>=0)
  {
    int temp=st[top];
    q.enqueue(temp);
    top--;
  }
  int size=(s-n);
  for(int i=0;i<size;i++)
  {
    int temp=arr[i];
    q.enqueue(temp);
  }
}
