/*
 * @lc app=leetcode.cn id=106 lang=java
 *
 * [106] 从中序与后序遍历序列构造二叉树
 */

// @lc code=start
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
    int i = 0;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        i = postorder.length - 1;
        return build(inorder, postorder, i, 0, inorder.length - 1);
    }
    TreeNode build(int[] inorder, int[] postorder, int i, int lo, int hi){
        if(lo > hi || i < 0) {
            return null;
        }
        TreeNode root = new TreeNode(postorder[i]);
        int index = -1;
        for(int j = lo;j <= hi;j++) {
            if(inorder[j] == postorder[i]) {
                index = j;
                break;
            }
        }
        i--;
        root.right = build(inorder, postorder, i, index + 1, hi);
        root.left = build(inorder, postorder, i, lo, index + 1);
        return root;
    }
}
// @lc code=end

