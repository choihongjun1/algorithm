package baekjoon.silver.no4949;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        List<Boolean> result = new ArrayList<>();

        String line = br.readLine();
        while(!line.equals(".")) {
            if(isVPS(line)) result.add(true);
            else result.add(false);
            line = br.readLine();
        }

        for(int i = 0; i < result.size(); i++) {
            if(result.get(i)) bw.write( "yes\n");
            else bw.write("no\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    public static boolean isVPS(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(' || c == '[') {
                stack.push(c);
            } else if(c == ')') {
                if(stack.isEmpty()) return false;
                if(stack.peek() == '(') stack.pop();
                else return false;
            } else if(c == ']') {
                if(stack.isEmpty()) return false;
                if(stack.peek() == '[') stack.pop();
                else return false;
            }
        }

        return stack.isEmpty();
    }
}
