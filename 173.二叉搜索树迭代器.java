import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=173 lang=java
 *
 * [173] 二叉搜索树迭代器
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
class BSTIterator {

    int index;
    List<TreeNode> list;

    public BSTIterator(TreeNode root) {
        index = 0;
        list = new ArrayList<>();
        traverse(root);
    }
    
    public int next() {
        int result = list.get(index).val;
        index ++;
        return result;
    }
    
    public boolean hasNext() {
        return index < list.size() && list.get(index) != null;
    }

    public void traverse(TreeNode root) {
        if (root == null) {
            return;
        }
        traverse(root.left);
        list.add(root);
        traverse(root.right);
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
// @lc code=end

