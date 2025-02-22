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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> arr=new ArrayList<>();
        InorderTraversal(root,arr);
        return arr;
    }
    public void InorderTraversal(TreeNode root ,ArrayList<Integer> arr)
    {
        if(root==null)
        return;
        InorderTraversal(root.left,arr);
        arr.add(root.val);
        InorderTraversal(root.right,arr);
    }
}