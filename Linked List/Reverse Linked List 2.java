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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right || head==null){
            return head;
        }
        ListNode newhead=new ListNode(0);
        ListNode curr=head;
        newhead.next=head;

        ListNode prev=newhead;
        int l=left;
        for(int i=0;i<left-1;i++){
            prev=prev.next;
        }
        curr=prev.next;
        for(int i=0;i<right-left;i++){
            ListNode nex=curr.next;
            curr.next=nex.next;
            nex.next=prev.next;
            prev.next=nex;
        }
        return newhead.next;
    }
}
