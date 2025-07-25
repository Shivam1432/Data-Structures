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
    public ListNode partition(ListNode head, int x) {
        ListNode curr=head;
        ListNode beforeHead=new ListNode(0);
        ListNode afterHead=new ListNode(0);
        ListNode after=afterHead;
        ListNode before=beforeHead;

        while(curr!=null){
            if(curr.val<x){
                before.next=curr;
                before=before.next;
                curr=curr.next;
            }
            else{
                after.next=curr;
                curr=curr.next;
                after=after.next;
            }
        }
        after.next=null;

        before.next=afterHead.next;
        return beforeHead.next;

    }
}
