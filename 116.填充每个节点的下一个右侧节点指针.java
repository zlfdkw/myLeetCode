import java.util.LinkedList;
import java.util.Queue;

import com.sun.corba.se.impl.orbutil.graph.Node;

/*
 * @lc app=leetcode.cn id=116 lang=java
 *
 * [116] 填充每个节点的下一个右侧节点指针
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    // public Node connect(Node root) {
    //     if(root == null) return null;
    //     Queue<Node> queue = new LinkedList<>();
    //     queue.add(root);
        
    //     while(!queue.isEmpty()) {
    //         Node prev = null;
    //         int i = queue.size();
    //         for (int j = 0; j < i; j++) {
    //             Node current = queue.poll();
    //             if (prev != null) {
    //                 prev.next = current;
    //             }
    //             if (current.left != null) {
    //                 queue.add(current.left);
    //             }
    //             if (current.right != null) {
    //                 queue.add(current.right);
    //             }
    //             prev = current;
    //         }
    //     }
    //     return root;
    // }

    public Node connect(Node root) {
        if (root == null) return null;
        traverse(root.left, root.right);
        return root;
    }

    public void traverse(Node left, Node right) {
        if(left == null || right == null) {
            return;
        }
        left.next = right;
        traverse(left.left, left.right);
        
        traverse(left.right, right.left);
        traverse(right.left, right.right);
    }
}
// @lc code=end

