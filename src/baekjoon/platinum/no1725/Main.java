package baekjoon.platinum.no1725;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] height = new int[n];
        for(int i = 0; i < n; i++) {
            height[i] = Integer.parseInt(br.readLine());
        }

        int area = largestRectangle(height, n);
        bw.write(area + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    public static int largestRectangle(int[] height, int n) {
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

