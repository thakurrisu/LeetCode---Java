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
    public static int isBalancedHelper(TreeNode root , int[] max) {
        if(root == null) return 0;
        int lh = isBalancedHelper(root.left , max);
        int rh = isBalancedHelper(root.right, max);

        max[0] = Math.max(max[0] , Math.abs(lh-rh));
       return Math.max(lh,rh) + 1;
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        int[] max = new int[1];
        int lh = isBalancedHelper(root ,max);
        if(max[0]>1) return false;
        return true;
        // int rh = isBalancedHelper(root.right);
        // if(Math.abs(lh-rh)>1) return false;
        // return isBalanced(root.left) && isBalanced(root.right);
    }
}