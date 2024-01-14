import java.util.Deque;
import java.util.LinkedList;

import javafx.util.converter.NumberStringConverter;

/*
 * @lc app=leetcode.cn id=239 lang=java
 *
 * [239] 滑动窗口最大值
 */

// @lc code=start
class Solution {

    class MyDeque {
        Deque<Integer> deque;
        MyDeque() {
            deque = new LinkedList<>();
        }

        // void push(Integer num) {
        //     while(!deque.isEmpty() && num > deque.getLast()) {
        //         deque.removeLast();
        //     }
        //     deque.add(num);
        // } 
        void push(int val) {
            while (!deque.isEmpty() && val > deque.getLast()) {
                deque.removeLast();
            }
            deque.add(val);
        }

        //使用Integer类型会报错？？？？？
        void poll(Integer num) {
            if(!deque.isEmpty() && deque.peek().equals(num)) {
                deque.poll();
            }
        }
        // void poll(int val) {
        //     if (!deque.isEmpty() && val == deque.peek()) {
        //         deque.poll();
        //     }
        // }

        // int getValue() {
        //     return deque.peek();
        // }
        int getValue() {
            return deque.peek();
        }
    }

    class MyQueue {
        Deque<Integer> deque = new LinkedList<>();
        void poll(int val) {
            if (!deque.isEmpty() && val == deque.peek()) {
                deque.poll();
            }
        }
        void add(int val) {
            while (!deque.isEmpty() && val > deque.getLast()) {
                deque.removeLast();
            }
            deque.add(val);
        }
        int peek() {
            return deque.peek();
        }
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length == 1) {
            return nums;
        }
        int len = nums.length - k + 1;
        int[] res = new int[len];
        MyDeque myDeque = new MyDeque();
        for(int i = 0;i < k;i++) {
            myDeque.push(nums[i]);
        }
        int index = 0;
        res[index++] = myDeque.getValue();
        for(int i = k;i < nums.length;i++) {
            myDeque.poll(nums[i - k]);
            myDeque.push(nums[i]);
            res[index++] = myDeque.getValue();
        }
        return res;
    }
    
}
// @lc code=end

