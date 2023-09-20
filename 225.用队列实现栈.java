import java.util.LinkedList;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=225 lang=java
 *
 * [225] 用队列实现栈
 */

// @lc code=start
class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;

    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    public void push(int x) {
        q1.add(x);
    }
    
    public int pop() {
        while(q1.size() != 1) {
            q2.add(q1.poll());
        }
        int res =  q1.poll();
        while(!q2.isEmpty()) {
            q1.add(q2.poll());
        }
        return res;
    }
    
    public int top() {
        while(q1.size() != 1) {
            q2.add(q1.poll());
        }
        int res =  q1.peek();
        q2.add(q1.poll());
        while(!q2.isEmpty()) {
            q1.add(q2.poll());
        }
        return res;
    }
    
    public boolean empty() {
        if(q1.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
// @lc code=end

