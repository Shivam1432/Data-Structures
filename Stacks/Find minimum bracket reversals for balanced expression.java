class Result
{
  static int minReversal(String expr)
  {
    int len=expr.length();
    CQStack obj=new CQStack(len);
    if(len%2!=0)
    {
      return -1;
    }
    int count=0;
    for (int i=0; i<len; i++) 
    { 
       char c = expr.charAt(i); 
       if (c ==']' && !obj.isEmpty()) 
       { 
          if (obj.peek()=='[')
          {
            obj.pop();
          }    
          else
          {
            obj.push(c); 
            count++;
          }
       } 
       else
       {
         obj.push(c);
         count++;
       }
    }
    int l=obj.length();
    int n = 0; 
    while (!obj.isEmpty() && obj.peek() == '[') 
    { 
      obj.pop(); 
      n++; 
    }
    return (l/2+n%2);
  }
}
class CQStack
{
  public int maxSize; // size of stack array
  public char[] stackArray;
  public int top; // top of stack
  public int length;
  public CQStack(int s) // constructor
  {
    maxSize=s;
    stackArray=new char[maxSize];
    top=-1;
    length=0;
  }

  public void push(char j) // put item on top of stack
  {
    if(isFull())
    {
      return;
    }
    top=top+1;
    stackArray[top]=j;
    length++;
  }
  
  public char pop() // take item from top of stack
  {
    if(isEmpty())
    {
      return 'c';
    }
    char temp;
    temp=stackArray[top];
    top--;
      length--;
    return temp;
  
  }
  public char peek()
  {
    char ch=stackArray[top];
    return ch;
  }
  public int length()
  {
    return length;
  }
  public boolean isEmpty() // true if stack is empty
  {
    return top==-1;
  }

  public boolean isFull() // true if stack is full
  {
    return top==maxSize;
  }
}
