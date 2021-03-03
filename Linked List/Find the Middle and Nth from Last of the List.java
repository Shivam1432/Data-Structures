/* class Node
{
  int data;
  Node next;
} */
static int findMiddle(Node head) 
{
  if(head==null)
  {
    return -1;
  }
  else{
    Node slow_ptr = head;
   Node fast_ptr = head;
  try{
    
        if (head != null)
        {
            while (slow_ptr != null && fast_ptr.next != null && fast_ptr!=null)
            {
                fast_ptr = fast_ptr.next.next;
                slow_ptr = slow_ptr.next;
            }
        return slow_ptr.data;
        }
    return slow_ptr.data;
  }
  catch(Exception e)
  {
  }
  return slow_ptr.data;
  }
}

static int findNLast(Node head, int n)
{
  if(head==null)
  {
    return -1;
  }
  else{
    Node temp=null,prev=null;
  try{
  int len = 0;
  temp=head;
  prev=null;
   while (temp != null) {
     prev=temp;
     temp = temp.next;
     len++;
   }
   temp=head;
   if (len < n)
   {
     return prev.data;
   }       
   for (int i = 1; i < len - n + 1; i++)
   {
      temp = temp.next;
   }
  return temp.data;
  }
  catch(Exception e)
  {

  }
    return temp.data;
  }
}
