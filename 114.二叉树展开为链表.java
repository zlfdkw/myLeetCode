import javax.swing.plaf.basic.BasicTreeUI.TreeTraverseAction;

/*
 * @lc app=leetcode.cn id=114 lang=java
 *
 * [114] 二叉树展开为链表
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

    // TreeNode dummy = new TreeNode(-1);
    // TreeNode p = dummy;

    // public void flatten(TreeNode root) {
    //     traverse(root);
    //     root = dummy.right;
    // }

    // void traverse(TreeNode root) {
    //     if(root == null) {
    //         return;
    //     }
    //     p.left = null;
    //     p.right = new TreeNode(root.val);
    //     p = p.right;
    //     traverse(root.left);
    //     traverse(root.right);
    // }

    public void flatten(TreeNode root) {
        if(root == null) {
            return;
        }
        flatten(root.left);
        flatten(root.right);
        TreeNode left = root.left;
        TreeNode right = root.right;
        root.left = null;
        root.right = left;
        TreeNode p = root;
        while(p.right != null) {
            p = p.right;
        }
        p.right = right;
    }
}
// @lc code=end

