/*
 * @lc app=leetcode.cn id=543 lang=java
 *
 * [543] 二叉树的直径
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

    int maxDiameter = 0;

    // public int diameterOfBinaryTree(TreeNode root) {
    //     traverse(root);
    //     return maxDiameter;
    // }

    // void traverse(TreeNode root) {
    //     if(root == null) {
    //         return;
    //     }
    //     int diameterLeft = maxDepth(root.left);
    //     int diameterRight = maxDepth(root.right);
    //     maxDiameter = Math.max(maxDiameter, diameterLeft + diameterRight);
    //     traverse(root.left);
    //     traverse(root.right);
    // }

    // int maxDepth(TreeNode root) {
    //     if(root == null) {
    //         return 0;
    //     }
    //     int maxDepthLeft = maxDepth(root.left);
    //     int maxDepthRight = maxDepth(root.right);
    //     return 1 + Math.max(maxDepthLeft, maxDepthRight);
    // }


    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return maxDiameter;
    }

    int maxDepth(TreeNode root) {
        if(root == null) {
             return 0;
        }
        int maxDepthLeft = maxDepth(root.left);
        int maxDepthRight = maxDepth(root.right);
        maxDiameter = Math.max(maxDiameter, maxDepthLeft + maxDepthRight);
        return 1 + Math.max(maxDepthLeft, maxDepthRight);
    }
}
// @lc code=end

