package baekjoon.silver.no9012;

import java.io.*;
import java.util.Stack;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        boolean[] result = new boolean[n];

        for(int i = 0; i < n; i++) {
            if(isVPS(br.readLine())) result[i] = true;
        }

        for(int i = 0; i < n; i++) {
            if(result[i]) bw.write("YES\n");
            else bw.write("NO\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    public static boolean isVPS(String ps) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < ps.length(); i++) {
            char c = ps.charAt(i);
            if(c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if(c == ')') {
                if(stack.isEmpty()) return false;
                if(stack.peek() == '(') stack.pop();
                else return false;
            } else if(c == '}') {
                if(stack.isEmpty()) return false;
                if(stack.peek() == '}') stack.pop();
                else return false;
            } else if(c == ']') {
                if(stack.isEmpty()) return false;
                if(stack.peek() == ']') stack.pop();
                else return false;
            }
        }

        return stack.isEmpty();
    }
}
