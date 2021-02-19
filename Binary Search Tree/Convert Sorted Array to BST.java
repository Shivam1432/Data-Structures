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
   public TreeNode insertNode(int arr[],int start,int end)
{
if(start>end)
    return null;
    int mid=start+(end-start)/2;
    TreeNode tmp=new TreeNode(arr[mid]);
    tmp.left=insertNode(arr,start,mid-1);
    tmp.right=insertNode(arr,mid+1,end);
    return tmp;
    
}


public TreeNode sortedArrayToBST(int[] nums) {
    
    return insertNode(nums,0,nums.length-1);
}
}
