import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main
{
  public static void main(String[] args)
  {
    // Write your code here
    int t;
    Scanner s=new Scanner(System.in);
    t=s.nextInt();
    while(t>0)
    {
      int n;
      n=s.nextInt();
      CQStack obj=new CQStack(n);
      while(n>0)
      {
        int j=s.nextInt();
        obj.push(j);
        n--;
      }
      obj.maxRight();
      t--;
    }
  }
}
class CQStack
{
  public int maxSize; // size of stack array
  public int[] stackArray;
  public int top; // top of stack

  public CQStack(int s) // constructor
  {
    maxSize=s;
    stackArray=new int[maxSize];
    top=-1;
  }

  public void push(int j) // put item on top of stack
  {
    if(isFull())
    {
      return;
    }
    top=top+1;
    stackArray[top]=j;
  }
  
  public int pop() // take item from top of stack
  {
    if(isEmpty())
    {
      return -1;
    }
    int temp;
    temp=stackArray[top];
    top--;
    return temp;
  }

  public boolean isEmpty() // true if stack is empty
  {
    return top==-1;
  }

  public boolean isFull() // true if stack is full
  {
    return top==maxSize;
  }
  public void maxRight()
  {
    for(int i=0;i<top;i++)
    {
      int j=i+1;
      if(stackArray[i]<stackArray[j])
      {
        System.out.print(stackArray[j]+" ");
      }
      else
      {
        System.out.print("-1 ");
      }
    }
    System.out.print("-1");
  }
}
