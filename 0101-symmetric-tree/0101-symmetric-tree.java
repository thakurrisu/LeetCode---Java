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
  public static boolean util(TreeNode left, TreeNode right){
    if(left == null && right == null) return true;
    if(left == null && right!=null) return false;
    if(right == null && left!=null) return false; 
    return left.val == right.val  
          && util(left.right,right.left) && util(left.left,right.right);
  }
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
        return true;
        return util(root.left , root.right);
    }
}