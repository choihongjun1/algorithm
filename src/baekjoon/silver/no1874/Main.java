package baekjoon.silver.no1874;

import java.io.*;
import java.util.Stack;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int prev = 0;
        int pushNum = 1;
        boolean flag = true;
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());

            if(prev < num) {
                for(int j = pushNum; j <= num; j++) {
                    stack.push(j);
                    pushNum++;
                    result.append("+\n");
                }
                stack.pop();
                result.append("-\n");
            } else {
                int popNum = stack.pop();
                if(popNum == num) {
                    result.append("-\n");
                } else {
                    flag = false;
                    break;
                }
            }

            prev = num;
        }

        if(flag) bw.write(result.toString());
        else bw.write("NO");

        br.close();
        bw.flush();
        bw.close();
    }
}