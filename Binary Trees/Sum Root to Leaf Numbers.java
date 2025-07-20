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
    int sum=0;
    public int sumNumbers(TreeNode root) {
        int path[]=new int[1];
        pathSum(path,root,"");
        return path[0];
    }
    public void pathSum(int[] path,TreeNode root,String s){
        if(root==null){
            return ;
        }
        if(root.left==null && root.right==null){
            s+=root.val;
            path[0]+=Integer.parseInt(s);
            return;
        }
        s+=root.val;
        pathSum(path,root.left,s);
        pathSum(path,root.right,s);
    }
}
