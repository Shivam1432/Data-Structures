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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null || lists.length==0){
            return null;
        }
        return mergeK(lists,0,lists.length-1);
    }
    public ListNode mergeK(ListNode[] lists,int st,int end){
        if(st==end){
            return lists[st];
        }
        if(st+1==end){
            return merge(lists[st],lists[end]);
        }
        int mid=(st+end)/2;
        ListNode l1=mergeK(lists,st,mid);
        ListNode l2=mergeK(lists,mid+1,end);
        return merge(l1,l2);
    }
    public ListNode merge(ListNode l1,ListNode l2){
        ListNode newHead=new ListNode(0);
        ListNode curr=newHead;

        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                ListNode p=new ListNode(l1.val);
                curr.next=p;
                curr=curr.next;
                l1=l1.next;
            }
            else{
                ListNode p=new ListNode(l2.val);
                curr.next=p;
                curr=curr.next;
                l2=l2.next;
            }
        }

        curr.next=(l1!=null)?l1:l2;
        return newHead.next;
    }
}
