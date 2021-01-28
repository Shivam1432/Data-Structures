/* class Node
{
  int data;
  Node next;
} */

static Node shiftSmallLarge(Node org)
{
  try{
  Node temp=org,prev=null;
  int s=org.data,l=org.data;
  Node s_prev=null,l_prev=null,s_node=org,l_node=org;
  
  if(org==null)
  {
    return null;
  }
  else
  {
    while(temp!=null)
  {  
     if(s>temp.data)
    { s_node=temp;
      s=temp.data;
       s_prev=prev;
    }
    if(l<temp.data)
    {  l_node=temp;
      l=temp.data;
      l_prev=prev;
    }
        prev=temp;
       temp=temp.next;
  }
   if(s_prev!=null){
   s_prev.next=s_node.next;
   s_node.next=org;
   org=s_node;
  }
    if(l_prev==s_node)
    {
      l_prev=s_prev;
    }
   if(l_node.next!=null)
   {
     l_prev.next=l_node.next;
     prev.next=l_node;
     l_node.next=null;
   }
  }
  }
  catch(Exception e)
  {}
    return org;
  }
