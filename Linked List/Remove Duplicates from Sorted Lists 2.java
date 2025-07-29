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
    public ListNode deleteDuplicates(ListNode head) {
        TreeSet<Integer> tree=new TreeSet<>();
        Set<Integer> list=new HashSet<>();
        ListNode p=head;
        while(p!=null){
            if(tree.contains(p.val) || list.contains(p.val)){
                tree.remove(p.val);
                list.add(p.val);
            }else if(!list.contains(p.val)){
                tree.add(p.val);
            }
            p=p.next;
        }
        p=head;
        ListNode curr=new ListNode(0);
        ListNode newHead=curr;
        for(int val:tree){
            System.out.println(val);
            curr.next=new ListNode(val);
            curr=curr.next;
        }
        return newHead.next;
    }
}



//solution 2:(without extra space allocation):

    class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode dummy = new ListNode(-1); // Dummy node to handle head removals
        dummy.next = head;
        ListNode prev = dummy;
        ListNode cur = head;

        while (cur != null && cur.next != null) {
            if (cur.val == cur.next.val) {
                // Skip all nodes with the same value
                while (cur.next != null && cur.val == cur.next.val) {
                    cur = cur.next;
                }
                prev.next = cur.next; // Remove duplicates
            } else {
                prev = prev.next; // Move to next distinct node
            }
            cur = cur.next;
        }

        return dummy.next;
    }
}
