package leetcode.hard.no85;

class Solution {
    public int maximalRectangle(char[][] matrix) {
        int n = matrix[0].length;
        int[] height = new int[n];
        int max = 0;
        for(int row = 0; row < matrix.length; row++) {
            for(int col = 0; col < n; col++) {
                if(matrix[row][col] == '1') height[col]++;
                else height[col] = 0;
            }
            int area = largestRectangle(height, n);
            max = Math.max(area, max);
        }

        return max;
    }

    public int largestRectangle(int[] height, int n) {
        int[] stack = new int[n];
        int top = -1;
        int max = 0;

        for(int i = 0; i <= n; i++) {
            int cur = i == n ? 0 : height[i];
            while(top >= 0 && height[stack[top]] > cur) {
                int h = height[stack[top--]];
                int left = top == -1 ? -1 : stack[top];
                int w = i - left - 1;
                max = Math.max(max, h * w);
            }

            if(i < n) stack[++top] = i;
        }

        return max;
    }
}
