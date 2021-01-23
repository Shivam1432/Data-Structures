
public class InfixToPostfix {
	private int maxSize; 
	  private int[] stackArray;
	  private int top; 

	  public InfixToPostfix(int s) 
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
	  public int peek()
	  {
		  return stackArray[top];
	  }
	  public boolean isFull() 
	  {
	    return (top == maxSize-1);
	  }
	static boolean isOperand(char ch)
	  {
	    return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (Character.isDigit(ch));
	  }

	  static int checkPrecedence(char ch)
	  {
	    switch (ch)
	    {
	      case '+':
	      case '-':      return 1;
	      case '*':
	      case '/':      return 2;
	      case '^':      return 3;
	    }
	    return -1;
	  }

	  static String infixToPostfix(InfixToPostfix s, String exp)
	  {
	    int i=0;
	    char c; String out=new String();
	    for(i=0;i<exp.length();i++)
	    {
	      c = exp.charAt(i);
	      if (isOperand(c))	
	        out += c;
	      else if (c == '(')	
	        s.push(c);
	      else if (c == ')')	
	      {
	        while (!s.isEmpty() && s.peek() != '(')
	          out += (char)s.pop();
	        if (!s.isEmpty() && s.peek() != '(')
	          return("Invalid expression.");
	        else
	          s.pop();  
	      }
	      else 
	      {
	        while (!s.isEmpty() && checkPrecedence(c) <= checkPrecedence((char)s.peek()))
	          out += (char)s.pop();
	        s.push(c);
	      }
	    }

	    while (!s.isEmpty())	
	      out += (char)s.pop();

	    return out;	
	  }

	  public static void main(String[] args)
	  {
		InfixToPostfix theStack = new InfixToPostfix(10); // make new stack
	    String exp = "6/(3^2)-8";
	    String output=null;
	    output=infixToPostfix(theStack, exp);
	    System.out.println("Given infix expression is : " + exp);
	    System.out.println("Equivalent postfix expression is : " + output);
	  }
}
