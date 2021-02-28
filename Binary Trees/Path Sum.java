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
    boolean flag=false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int[] path=new int[1000];
        printPath(path,0,root,targetSum);
        return flag;
    }
    public void printPath(int[] path,int pathLen,TreeNode root,int sum)
    {
        if(root==null)
        {
            return;
        }
        path[pathLen++]=root.val;
        if(root.left==null && root.right==null)
        {
            checkSum(path,pathLen,sum);
        }
        printPath(path,pathLen,root.left,sum);
        printPath(path,pathLen,root.right,sum);
    }
    public void checkSum(int[] path,int pathLen,int sum)
    {
        int s=0;
        for(int i=0;i<pathLen;i++)
        {
            s+=path[i];
        }
        if(s==sum)
        {
            flag=true;
        }
    }
}
