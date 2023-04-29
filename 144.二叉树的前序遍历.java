import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=144 lang=java
 *
 * [144] 二叉树的前序遍历
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
    // List<Integer> list = new  ArrayList<>();
    // public List<Integer> preorderTraversal(TreeNode root) {
    //     traverse(root);
    //     return list;
    // }

    // void traverse(TreeNode root) {
    //     if(root == null) {
    //         return;
    //     }
    //     list.add(root.val);
    //     traverse(root.left);
    //     traverse(root.right);
    // }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) {
            return list;
        }
        list.add(root.val);
        list.addAll(preorderTraversal(root.left));
        list.addAll(preorderTraversal(root.right));
        return list;
    }
}
// @lc code=end

