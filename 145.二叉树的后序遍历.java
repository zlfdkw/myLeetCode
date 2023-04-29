import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

/*
 * @lc app=leetcode.cn id=145 lang=java
 *
 * [145] 二叉树的后序遍历
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
    // public List<Integer> postorderTraversal(TreeNode root) {
    //     traverse(root);
    //     return list;
    // }

    // void traverse(TreeNode root) {
    //     if(root == null) {
    //         return;
    //     }
    //     traverse(root.left);
    //     traverse(root.right);
    //     list.add(root.val);
    // }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) {
            return list;
        }
        list.addAll(postorderTraversal(root.left));
        list.addAll(postorderTraversal(root.right));
        list.add(root.val);
        return list;
    }
}
// @lc code=end

