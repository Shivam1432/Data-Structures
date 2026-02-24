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
    int total=0;
    public int sumRootToLeaf(TreeNode root) {
        int path[]=new int[1];
        build(root,"",path);
        total=path[0];
        return total;
    }
    public void build(TreeNode root,String s,int[] path){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            s+=root.val;
            path[0]+=Integer.parseInt(s,2);
            return;
        }
        s+=root.val;
        build(root.left,s,path);
        build(root.right,s,path);
    }
}
