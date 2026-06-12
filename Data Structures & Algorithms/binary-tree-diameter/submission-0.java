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
    int max=0;
    int length(TreeNode root)
    {
        if(root==null) return 0;
        int left=length(root.left)+1;
        int right=length(root.right)+1;
        return Math.max(left,right);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int lefth=length(root.left);
        int righth=length(root.right);
        max=Math.max(max,lefth+righth);
        int left=diameterOfBinaryTree(root.left);
        int right=diameterOfBinaryTree(root.right);
        return max;
        

    }
}
