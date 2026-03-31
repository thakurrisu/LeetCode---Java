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
   public boolean checkIfSymmetric(TreeNode leftNode,TreeNode rightNode)
    {
        if(leftNode==null && rightNode==null) return true;
        if(leftNode == null || rightNode == null) return false;
        return leftNode.val == rightNode.val &&
                checkIfSymmetric(leftNode.right,rightNode.left) 
                && checkIfSymmetric(leftNode.left,rightNode.right);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return checkIfSymmetric(root.left,root.right);
    }
}