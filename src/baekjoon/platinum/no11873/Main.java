package baekjoon.platinum.no11873;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        while(!(n == 0 && m == 0)) {
            int[] height = new int[m];
            int max = 0;
            for(int row = 0; row < n; row++) {
                st = new StringTokenizer(br.readLine());
                for(int col = 0; col < m; col++) {
                    if(Integer.parseInt(st.nextToken()) == 1) height[col]++;
                    else height[col] = 0;
                }
                int area = largestRectangle(height, m);
                max = Math.max(max, area);
            }

            bw.write(max + "\n");

            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
        }

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
