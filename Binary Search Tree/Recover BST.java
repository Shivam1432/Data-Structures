/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void recoverTree(TreeNode root) {
        inOrder(root);
        if(first!=null && sec!=null){
            int temp=first.val;
            first.val=sec.val;
            sec.val=temp;
        }
    }
    TreeNode prev=null,sec=null,first=null;
    public void inOrder(TreeNode root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        if(prev!=null && prev.val>root.val){
            if(first==null){
                first=prev;
            }
            sec=root;
        }
        prev=root;
        inOrder(root.right);
    }
}
