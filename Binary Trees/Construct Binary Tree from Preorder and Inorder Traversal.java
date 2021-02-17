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
class Index{
    int index;
}
class Solution {
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Index pIndex=new Index();
        pIndex.index=0;
        int n=preorder.length;
        return buildUtil(preorder,inorder,0,n-1,pIndex);
    }
    public TreeNode buildUtil(int[] pre,int[] in,int st,int end,Index pIndex)
    {
        if(st>end)
        {
            return null;
        }
        TreeNode node=new TreeNode(pre[pIndex.index++]);
        if(st==end)
        {
            return node;
        }
        int i=search(in,st,end,node.val);
        node.left=buildUtil(pre,in,st,i-1,pIndex);
        node.right=buildUtil(pre,in,i+1,end,pIndex);
        return node;
    }
    public int search(int[] in,int st,int end,int key)
    {
        int i;
        for(i=st;i<=end;i++)
        {
            if(in[i]==key)
            {
                break;
            }
        }
        return i;
    }
}
