/*
 * @lc app=leetcode.cn id=105 lang=java
 *
 * [105] 从前序与中序遍历序列构造二叉树
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

    // int i = 0;

    // public TreeNode buildTree(int[] preorder, int[] inorder) {
    //     return build(preorder, inorder, 0, inorder.length - 1);
    // }

    // TreeNode build(int[] preorder, int[] inorder, int lo,int hi) {
    //     if(lo > hi || i >= preorder.length) {
    //         return null;
    //     }
    //     TreeNode root = new TreeNode(preorder[i]);
    //     int index = -1;
    //     for(int j = lo;j <= hi;j++) {
    //         if(inorder[j] == preorder[i]){
    //             index = j;
    //             break;
    //         }
    //     }
    //     i++;
    //     root.left = build(preorder, inorder, lo, index - 1);
    //     i++;
    //     root.right = build(preorder, inorder, index + 1, hi);
    //     return root;
    // }
    int i = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        i = 0;
        return build(preorder, inorder, 0, inorder.length - 1);
    }

    TreeNode build(int[] preorder, int[] inorder, int inStart, int inEnd) {
        if (inStart > inEnd || i >= preorder.length) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[i]);
        int index = -1;
        for (int j = inStart; j <= inEnd; j++) {
            if (inorder[j] == preorder[i]) {
                index = j;
                break;
            }
        }
        i++;
        root.left = build(preorder, inorder, inStart, index - 1);
        // if(root.left != null) {
        //     i++;
        // }
        root.right = build(preorder, inorder, index + 1, inEnd);
        return root;
    }
}
// @lc code=end

