/*
 * @lc app=leetcode.cn id=104 lang=java
 *
 * [104] 二叉树的最大深度
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

    // int res = 0;
    // int depth = 0;

    // public int maxDepth(TreeNode root) {
    //     traverse(root);
    //     return res;
    // }

    // void traverse(TreeNode root) {
    //     if(root == null) {
    //         return;
    //     }
    //     depth++;
    //     if(root.left == null && root.right == null) {
    //         res = Math.max(res, depth);
    //     }
    //     traverse(root.left);
    //     traverse(root.right);
    //     depth--;
    // }

    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int depthLeft = maxDepth(root.left);
        int depthRight = maxDepth(root.right);

        return Math.max(depthLeft, depthRight) + 1;
    }
}
// @lc code=end

