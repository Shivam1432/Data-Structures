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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        ListNode curr=head;
        int l=1;
        while(curr.next!=null){
            curr=curr.next;
            l++;
        }
        curr.next=head;
        k=k%l;
        int steps=l-k;
        ListNode tail=head;
        for(int i=1;i<steps;i++){
            tail=tail.next;
        }
        ListNode newHead=tail.next;
        tail.next=null;

        return newHead;
    }
}
