import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=94 lang=java
 *
 * [94] 二叉树的中序遍历
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
    // List<Integer> list = new ArrayList<>();
    // public List<Integer> inorderTraversal(TreeNode root) {
    //     traverse(root);
    //     return list;
    // }

    // void traverse(TreeNode root) {
    //     if(root == null) {
    //         return;
    //     }
    //     traverse(root.left);
    //     list.add(root.val);
    //     traverse(root.right);
    // }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) {
            return list;
        }
        list.addAll(inorderTraversal(root.left));
        list.add(root.val);
        list.addAll(inorderTraversal(root.right));
        return list;
    }
}
// @lc code=end

