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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<Integer> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        q.offer(root);
        
        while(!q.isEmpty()){
            int size=q.size();
            
            for(int i=0;i<size;i++){
                TreeNode cv=q.poll();
                if(i == size-1 ){
                
                result.add(cv.val);
                }
                if(cv.left!=null){
                    q.offer(cv.left);
                }
                if(cv.right!=null){
                  q.offer(cv.right);
                }

            }
            

        }
        return result;
    }
}