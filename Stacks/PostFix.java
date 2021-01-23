
public class PostFix {
	private int maxSize; 
	  private int[] stackArray;
	  private int top; 

	  public PostFix(int s) 
	  {
	    maxSize = s; 
	    stackArray = new int[maxSize];
	    top = -1;
	  }
	  public void push(int j) 
	  {
	    if(isFull())
	    {
	      System.out.print("OVERFLOW");
	    }
	    else
	    {
	      stackArray[++top] = j;
	    }
	  }
	  public int pop() 
	  {
	    if (isEmpty())
	    {
	      System.out.println("UNDERFLOW");
	      return -1;
	    }
	    else
	    {
	      int temp=stackArray[top--];
	      return temp; 
	    }
	  }
	  public boolean isEmpty() 
	  {
	    return (top == -1);
	  }
	  public boolean isFull() 
	  {
	    return (top == maxSize-1);
	  }
	  static int evaluatePostfix(PostFix s, String exp)
	  {
	    int i, op1, op2, answer;
	    for (i = 0; i < exp.length(); ++i)
	    {
	      char c = exp.charAt(i);
	      if (Character.isDigit(c))
	        s.push(c - '0');
	      
	      else
	      {
	        op2 = s.pop();
	        op1 = s.pop();
	        switch(c)
	        {
	          case '+': s.push(op1 + op2); break;
	          case '-': s.push(op1 - op2); break;
	          case '*': s.push(op1 * op2); break;
	          case '/': s.push(op1 / op2); break;
	          case '^': s.push((int)Math.pow(op1, op2)); break; 
	        }
	      }
	    }
	    answer = s.pop();
	    return answer;
	  }

	  public static void main(String[] args)
	  {
	    PostFix theStack = new PostFix(10); // make new stack
	    String exp = "632+7*+";
	    System.out.println("Value of " + exp + " postfix expression is " + evaluatePostfix(theStack,exp));
	  }
}
