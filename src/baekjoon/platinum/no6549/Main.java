package baekjoon.platinum.no6549;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String line = br.readLine();
        while(!line.equals("0")) {
            StringTokenizer st = new StringTokenizer(line);
            int n = Integer.parseInt(st.nextToken());
            int[] height = new int[n];
            for(int i = 0; i < n; i++) {
                height[i] = Integer.parseInt(st.nextToken());
            }

            long area = largestRectangle(height, n);
            bw.write(area + "\n");

            line = br.readLine();
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static long largestRectangle(int[] height, int n) {
        int[] stack = new int[n];
        int top = -1;
        long max = 0;

        for(int i = 0; i <= n; i++) {
            int cur = i == n ? 0 : height[i];
            while(top >= 0 && height[stack[top]] > cur) {
                int h = height[stack[top--]];
                int left = top == -1 ? -1 : stack[top];
                int w = i - left - 1;
                max = Math.max(max, (long)h * w);
            }

            if(i < n) stack[++top] = i;
        }

        return max;
    }
}
