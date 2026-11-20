package leetcode.hard.no84;

import java.util.Stack;

class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int max = 0;

        for(int i = 0; i < heights.length; i++) {
            int cur = i == heights.length - 1 ? 0 : heights[i];

            while(!stack.isEmpty() && heights[stack.peek()] > cur) {
                int h = heights[stack.pop()];
                int left = stack.isEmpty() ? -1 : stack.peek();
                int w = i - left - 1;
                max = Math.max(max, h * w);
            }

            if(i < heights.length - 1) stack.push(i);
        }

        return max;
    }
}
