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
    public ListNode insertionSortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode p=null;
        ListNode slow=head,fast=head;

        while(fast!=null && fast.next!=null){
            p=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        p.next=null;
        ListNode l1=insertionSortList(head);
        ListNode l2=insertionSortList(slow);

        return sort(l1,l2);
    }

    public ListNode sort(ListNode l1,ListNode l2){
        ListNode p=new ListNode(0);
        ListNode curr=p;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                curr.next=new ListNode(l1.val);
                l1=l1.next;
                curr=curr.next;
            }
            else{
                curr.next=new ListNode(l2.val);
                l2=l2.next;
                curr=curr.next;
            }
        }
        if(l1!=null){
            curr.next=l1;
        }
        if(l2!=null){
            curr.next=l2;
        }
        return p.next;
    }
}
