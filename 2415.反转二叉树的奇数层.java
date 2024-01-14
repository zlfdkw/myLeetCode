import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=2415 lang=java
 *
 * [2415] 反转二叉树的奇数层
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
    public TreeNode reverseOddLevels(TreeNode root) {
        int index = 0;
        reverse(root, index);
        return root;
    }

    public void reverse (TreeNode root, int index) {
        if(root == null) {
            return;
        }
        if(index % 2 == 0 && root.left != null) {
            int temp = root.left.val;
            root.left.val = root.right.val;
            root.right.val = temp;
            index++;
            reverse(root.left, index);
            reverse(root.right, index);
        } else {
            index++;
            reverse(root.left, index);
            reverse(root.right, index);
        }
        index--;
    }
}
// @lc code=end

