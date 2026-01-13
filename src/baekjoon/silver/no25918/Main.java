package baekjoon.silver.no25918;

import java.io.*;
import java.util.Stack;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        Stack<Character> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int h = 0;
        int max = 0;
        for(int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if(stack.isEmpty() || stack.peek() == c) {
                stack.push(c);
                h++;
                if(h > max) max = h;
            } else if(stack.peek() != c) {
                stack.pop();
                h--;
            }
        }

        if(stack.isEmpty()) bw.write(max + "\n");
        else bw.write("-1");

        br.close();
        bw.flush();
        bw.close();
    }
}
