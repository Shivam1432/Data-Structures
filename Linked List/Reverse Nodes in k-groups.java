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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode p=head;
        int count=0;
        while(p!=null)
        {
            count++;
            p=p.next;
        }
        int rem=count%k;
        int rot=count/k;
        ListNode cur=head;
        ListNode prev=null;
        ListNode dummy=new ListNode(0);
        ListNode newHead=dummy;
        for(int i=0;i<rot;i++)
        {
            int[] arr=new int[k];
            int j=0;
            int c=k;
            while(c>0)
            {
                prev=cur;
                arr[j++]=cur.val;
                cur=cur.next;
                c--;
            }
            for(int l=arr.length-1;l>=0;l--)
            {
                int val=arr[l];
                newHead.next=new ListNode(val);
                newHead=newHead.next;
            }
            
        }
        if(rem!=0)
        {
            while(cur!=null)
            {
                int v=cur.val;
                newHead.next=new ListNode(v);
                cur=cur.next;
                newHead=newHead.next;
            }
        }
        return dummy.next;
    }
}
