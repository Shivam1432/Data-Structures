/* class LinkList
{
  int data;
  LinkList next;
  LinkList prev;
} */

  static LinkList rearrangeList(LinkList head)
  {
try{ 
    if(head==null)
     {
       return head;
     }
    else
    {
      LinkList odd = head;  
    LinkList even = head.next; 
    LinkList evenFirst=even;
    LinkList oddFirst=odd;
    while (1 == 1)  
    {  
        if (odd == null || even == null || 
                        (even.next) == null)  
        {  
            odd.next=null;
            even.next = oddFirst; 
            
            break;  
        }
       odd.next = even.next;  
        odd = even.next; 
        if (odd.next == null)  
        {
            even.next = oddFirst;  
            break;  
        } 
        even.next = odd.next;  
        even = odd.next;  
    }
    head=evenFirst;
    }
    }
    catch(Exception e)
    {}
    return head;
  }
