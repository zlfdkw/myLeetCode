import java.util.Stack;

/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 */

// @lc code=start
class Solution {

    public static void main(String[] args) {
        String s = "()";
        Solution solution = new Solution();
        solution.isValid(s);
    }

    public boolean isValid(String s) {
        if(s.length() == 0) {
            return true;
        } else if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else {
                if(stack.size() == 0) {
                    return false;
                } else if(s.charAt(i) == ')' && stack.peek() != '(') {
                    return false;
                } else if(s.charAt(i) == ']' && stack.peek() != '[') {
                    return false;
                } else if(s.charAt(i) == '}' && stack.peek() != '{') {
                    return false;
                } else {
                    stack.pop();
                    continue;
                }
            }
        }
        if(stack.size() != 0) {
            return false;
        }
        return true;
    }

    
}
// @lc code=end

