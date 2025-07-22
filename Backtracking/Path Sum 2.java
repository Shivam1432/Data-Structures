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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> paths=new ArrayList<>();
        pathSum(root,targetSum,list,paths,0);
        return list;
    }
    public void pathSum(TreeNode root, int targetSum,List<List<Integer>> list,List<Integer> paths,int sum){
        if(root==null){
            return;
        }
        sum+=root.val;
        paths.add(root.val);
        if(root.left==null && root.right==null && targetSum==sum){
            list.add(new ArrayList<>(paths));
        }
        pathSum(root.left,targetSum,list,paths,sum);
        pathSum(root.right,targetSum,list,paths,sum);

        paths.remove(paths.size()-1);
    }
}
