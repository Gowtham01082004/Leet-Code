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
    public void preoder(TreeNode root,ArrayList<Integer> output){
        if(root==null){
            return;
        }
        output.add(root.val);
        preoder(root.left,output);
         preoder(root.right,output);

    }
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> output=new ArrayList<>();
        preoder(root,output);

        return output;
        
    }
}