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
