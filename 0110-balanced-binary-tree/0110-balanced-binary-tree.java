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
    public boolean isBalanced(TreeNode root) {
        return isBalanced2(root)!=-1;
    }
    public int isBalanced2(TreeNode root)
    {
        if(root==null)
        return 0;
        int l=isBalanced2(root.left);
        int r=isBalanced2(root.right);
        if(l==-1 || r==-1)return -1;
        if(Math.abs(l-r)>1)return -1;
        return Math.max(l,r)+1;
    }
}