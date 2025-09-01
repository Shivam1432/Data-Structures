/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode p=head;
        ListNode cur=head;
        int count=0;
        while(p!=null)
        {
            count++;
            p=p.next;
        }
        ListNode prev=head;
        int round=count/2;
        int rem=count%2;
        ListNode temp=new ListNode(0);
        ListNode t=temp;
        if(count==1)
        {
            return head;
        }
        for(int i=0;i<round;i++)
        {
            while(cur!=null && prev.next!=null)
            {
                prev=cur;
                cur=cur.next;
                prev.next=cur.next;
                cur.next=prev;
                t.next=new ListNode(cur.val);
                t=t.next;
                t.next=new ListNode(prev.val);
                t=t.next;
                prev=prev.next;
                cur=cur.next.next;
            }
        }
        if(rem==1)
        {
            t.next=new ListNode(prev.val);
            t=t.next;
        }
        return temp.next;
    }
}
