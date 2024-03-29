import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=752 lang=java
 *
 * [752] 打开转盘锁
 */

// @lc code=start
class Solution {

    
    public String plus(String s, int index) {
        char[] temp = s.toCharArray();
        if(temp[index] == '9') {
            temp[index] = '0';
        } else {
            temp[index]++;
        }
        return new String(temp);
    }

    public String minu(String s,int index) {
        char[] temp = s.toCharArray();
        if(temp[index] == '0') {
            temp[index] = '9';
        } else {
            temp[index]--;
        }
        return new String(temp);
    }
    // String plus(String s, int j) {
    //     char[] ch = s.toCharArray();
    //     if (ch[j] == '9')
    //         ch[j] = '0';
    //     else
    //         ch[j] += 1;
    //     return new String(ch);
    // }
    // // 将 s[i] 向下拨动一次
    // String minu(String s, int j) {
    //     char[] ch = s.toCharArray();
    //     if (ch[j] == '0')
    //         ch[j] = '9';
    //     else
    //         ch[j] -= 1;
    //     return new String(ch);
    // }
    public int openLock(String[] deadends, String target) {
        Queue<String> queue = new LinkedList<>();
        HashSet dead = new HashSet<>();
        for (String deadend : deadends) {
            dead.add(deadend);
        }
        HashSet used = new HashSet<>();
        queue.offer("0000");
        used.add("0000");
        int step = 0;
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0;i < size;i++) {
                String cur = queue.poll();
                if(cur.equals(target)) {
                    return step;
                }
                if(dead.contains(cur)) {
                    continue;
                }
                for(int j = 0;j < 4;j++) {
                    String up = plus(cur, j);
                    if(!used.contains(up)) {
                        queue.offer(up);
                        used.add(up);
                    }
                    String down = minu(cur, j);
                    if(!used.contains(down)) {
                        queue.offer(down);
                        used.add(down);
                    }
                }
            }
            step++;
        }
        return -1;
    //     Set<String> deads = new HashSet<>();
    // for (String s : deadends) deads.add(s);
    // // 记录已经穷举过的密码，防止走回头路
    // Set<String> visited = new HashSet<>();
    // Queue<String> q = new LinkedList<>();
    // // 从起点开始启动广度优先搜索
    // int step = 0;
    // q.offer("0000");
    // visited.add("0000");
    
    // while (!q.isEmpty()) {
    //     int sz = q.size();
    //     /* 将当前队列中的所有节点向周围扩散 */
    //     for (int i = 0; i < sz; i++) {
    //         String cur = q.poll();
            
    //         /* 判断是否到达终点 */
    //         if (deads.contains(cur))
    //             continue;
    //         if (cur.equals(target))
    //             return step;
            
    //         /* 将一个节点的未遍历相邻节点加入队列 */
    //         for (int j = 0; j < 4; j++) {
    //             String up = plus(cur, j);
    //             if (!visited.contains(up)) {
    //                 q.offer(up);
    //                 visited.add(up);
    //             }
    //             String down = minu(cur, j);
    //             if (!visited.contains(down)) {
    //                 q.offer(down);
    //                 visited.add(down);
    //             }
    //         }
    //     }
    //     /* 在这里增加步数 */
    //     step++;
    // }
    // // 如果穷举完都没找到目标密码，那就是找不到了
    // return -1;
    }
}
// @lc code=end

