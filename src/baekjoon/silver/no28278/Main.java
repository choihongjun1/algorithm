package baekjoon.silver.no28278;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        Stack<String> stack = new Stack<>();
        List<String> result = new ArrayList<>();

        for(int i = 1; i <= n; i++) {
            String s = br.readLine();
            if(s.charAt(0) == '1') {
                stack.push(s.substring(2));
            } else if(s.equals("2")) {
                if(!stack.isEmpty()) {
                    result.add(stack.pop());
                } else {
                    result.add("-1");
                }
            } else if(s.equals("3")) {
                result.add(String.valueOf(stack.size()));
            } else if(s.equals("4")) {
                if(!stack.isEmpty()) {
                    result.add("0");
                } else {
                    result.add("1");
                }
            } else if(s.equals("5")) {
                if(!stack.isEmpty()) {
                    result.add(stack.peek());
                } else {
                    result.add("-1");
                }
            }
        }

        for(String s : result) bw.write(s + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
