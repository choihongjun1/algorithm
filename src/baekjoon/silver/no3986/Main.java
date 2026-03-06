package baekjoon.silver.no3986;

import java.io.*;
import java.util.Stack;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i = 0; i < n; i++) {
            String word = br.readLine();
            Stack<Character> stack = new Stack<>();
            for(int j = 0; j < word.length(); j++) {
                char c = word.charAt(j);
                if(stack.isEmpty()) stack.push(c);
                else {
                    if(stack.peek() == c) stack.pop();
                    else stack.push(c);
                }
            }
            if(stack.isEmpty()) count++;
        }

        bw.write(count + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
