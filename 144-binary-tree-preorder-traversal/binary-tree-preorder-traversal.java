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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        helper(root,result);
        return result;
    }
    public void helper(TreeNode head,List<Integer> result){
        if(head==null){
            return;
        }
        //h left rigt
        result.add(head.val);
        if(head.left!=null){
            helper(head.left,result);
        }
        if(head.right!=null){
            helper(head.right,result);
        }
    }
}