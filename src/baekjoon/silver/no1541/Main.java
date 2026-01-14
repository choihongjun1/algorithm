package baekjoon.silver.no1541;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String[] s = br.readLine().split("-");
        int sum = f(s[0]);
        for(int i = 1; i < s.length; i++) {
            sum -= f(s[i]);
        }
        bw.write(sum + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    public static int f(String s) {
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '+') {
                sum += Integer.parseInt(sb.toString());
                sb = new StringBuilder();
            } else {
                sb.append(c);
            }
        }
        sum += Integer.parseInt(sb.toString());
        return sum;
    }
}
