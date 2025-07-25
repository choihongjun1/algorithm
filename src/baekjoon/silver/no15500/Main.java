package baekjoon.silver.no15500;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        Stack<Integer> start = new Stack<>();
        Stack<Integer> mid = new Stack<>();

        int n = Integer.parseInt(br.readLine());
        String[] numbers = br.readLine().split(" ");
        for (int i = 0; i < n; i++) start.push(Integer.parseInt(numbers[i]));

        List<String> result = new ArrayList<>();
        while(n > 0) {
            if(start.contains(n)) {
                while(start.peek() != n) {
                    mid.push(start.pop());
                    result.add("1 2\n");
                }
                start.pop();
                result.add("1 3\n");
            } else if(mid.contains(n)) {
                while(mid.peek() != n) {
                    start.push(mid.pop());
                    result.add("2 1\n");
                }
                mid.pop();
                result.add("2 3\n");
            }
            n--;
        }

        bw.write(result.size() + "\n");
        for(String s : result) bw.write(s);

        bw.flush();
        bw.close();
        br.close();
    }
}
