/* push(int), pop(), isEmpty(), isFull() are available on Stack. */
class Queue
{
  void enqueue(CQStack st1, CQStack st2, int item)
  {
        while(!st1.isEmpty()) 
        {  
            st2.push(st1.pop()); 
        }    
        st1.push(item);  
        while (!st2.isEmpty())  
        {  
            st1.push(st2.pop()); 
        }
  }

  int dequeue(CQStack st1, CQStack st2)
  {
        if(st1.isEmpty())  
        {  
            return -1;  
        }    
        int x = st1.stackArray[st1.top];  
        st1.pop();  
        return x;
  }
}
