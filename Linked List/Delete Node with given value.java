   public static ListNode removeNode(ListNode head,int v){
        if(head==null)
        {
            return null;
        }
        if(head.next==null)
        {
            if(head.val==v)
            {
                return null;
            }
            else
            {
                return head;
            }
        }
        while(head.val==v && head.next!=null){
            head=head.next;
        }
        if(head.next==null && head.val == v) 
        {
            return null;
        }
       ListNode curr = head;
        while(curr.next != null){
            if(curr.next.val == v)
            {
               curr.next = curr.next.next;  
            }
            else 
            {
                curr=curr.next;
            }
        }
      return head;
    }
