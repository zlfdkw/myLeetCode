import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=797 lang=java
 *
 * [797] 所有可能的路径
 */

// @lc code=start
class Solution {

    List<List<Integer>> res = new LinkedList<>();

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        LinkedList<Integer> list = new LinkedList<>();
        traverse(graph, 0, list);
        return res;
    }

    public void traverse(int[][] graph, int s, LinkedList<Integer> list) {
        list.addLast(s);

        if (s == graph.length - 1) {
            res.add(new LinkedList<>(list));
        }

        for (int i = 0; i < graph[s].length; i++) {
            traverse(graph, graph[s][i], list);
        }

        list.removeLast();
    }
}
// @lc code=end

