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
    // public List<TreeNode> generateTrees(int n) {
    //     List<TreeNode> list=new ArrayList<>();
    //     for(int i=1;i<=n;i++){
    //         generate(list,null,n,i);
    //     }
    //     return list;
    // }
    // public void generate(List<TreeNode> list,TreeNode root,int n,int key){
    //     if(root==null){
    //         TreeNode node=new TreeNode(key);
    //         node.left=node.right=null;
    //         list.add(node);
    //     }
    //     if(root.val<key){
    //         root.right=generate(list,root.right,n,key);
    //     }
    //     else{
    //         root.left=generate(list,root.left,n,key);
    //     }
    //     return;
    // }

    public List<TreeNode> generateTrees(int n) {
        return n > 0 ? generate_trees(1, n) : new ArrayList<>();
    }

    private List<TreeNode> generate_trees(int start, int end) {
        List<TreeNode> all_trees = new ArrayList<>();
        if (start > end) {
            all_trees.add(null);
            return all_trees;
        }

        for (int i = start; i <= end; i++) {
            List<TreeNode> left_trees = generate_trees(start, i - 1);
            List<TreeNode> right_trees = generate_trees(i + 1, end);

            for (TreeNode l : left_trees) {
                for (TreeNode r : right_trees) {
                    TreeNode current_tree = new TreeNode(i);
                    current_tree.left = l;
                    current_tree.right = r;
                    all_trees.add(current_tree);
                }
            }
        }
        return all_trees;
    }
}
