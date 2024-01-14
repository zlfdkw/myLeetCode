
import java.util.List;

import javax.swing.text.AsyncBoxView.ChildState;
import javax.swing.tree.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) return list;
        Deque<TreeNode> deque = new ArrayDeque<>();
        int length = 1;
        deque.add(root);
        while(!deque.isEmpty()) {
            int temp = 0;
            List<Integer> child = new ArrayList<>();
            for (int i = 0; i < length;i++) {
                TreeNode cur = deque.poll();
                child.add(cur.val);
                if (cur.left != null) {
                    deque.add(cur.left);
                    temp++;
                }
                if (cur.right != null) {
                    deque.add(cur.right);
                    temp++;
                }
            }
            list.add(child);
            length = temp;
        }
        return list;
    }
}