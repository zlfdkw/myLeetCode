import java.util.Stack;

/*
 * @lc app=leetcode.cn id=150 lang=java
 *
 * [150] 逆波兰表达式求值
 */

// @lc code=start
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < tokens.length;i++) {
            if(!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("/") && !tokens[i].equals("*")) {
                stack.push(Integer.parseInt(tokens[i]));
            } else {
                int right = stack.pop();
                int left = stack.pop();
                switch (tokens[i].charAt(0)){
                    case '+': 
                        stack.push(left + right);break;
                    case '-': 
                        stack.push(left - right);break;
                    case '*': 
                        stack.push(left * right);break;
                    case '/': 
                        stack.push(left / right);break;
                }

            }
        }
        return stack.pop();
    }
}
// @lc code=end

