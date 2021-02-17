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
    public boolean isValidBST(TreeNode root) {
        if(isBSTUtil(root,null,null))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static boolean isBSTUtil(TreeNode root,Integer min,Integer max)
    {
        if(root==null)
            return true;
        if((min != null && root.val <= min) || (max != null && root.val >= max)) 
            return false;
        return (isBSTUtil(root.left,min,root.val)&&isBSTUtil(root.right,root.val,max));
    }
}
