import java.util.Stack;

/*
 * @lc app=leetcode.cn id=232 lang=java
 *
 * [232] 用栈实现队列
 */

// @lc code=start
class MyQueue {

    Stack<Integer> outStack;
    Stack<Integer> insStack;

    public MyQueue() {
        outStack = new Stack<>();
        insStack = new Stack<>();
    }
    
    public void push(int x) {
        insStack.push(x);
    }
    
    public int pop() {
        if(!outStack.empty()) {
            return outStack.pop();
        } else if (!insStack.empty()) {
            while(!insStack.empty()) {
                outStack.push(insStack.pop());
            }
        }
        return outStack.pop();
    }
    
    public int peek() {
        if(!outStack.empty()) {
            return outStack.peek();
        } else if (!insStack.empty()) {
            while(!insStack.empty()) {
                outStack.push(insStack.pop());
            }
        }
        return outStack.peek();
    }
    
    public boolean empty() {
        if(insStack.empty() && outStack.empty()) {
            return true;
        } else {
            return false;
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
// @lc code=end

