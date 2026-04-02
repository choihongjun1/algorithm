package baekjoon.bronze.no28352;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int week = 6;
        for(int i = 11; i <= n; i++) {
            week *= i;
        }
        bw.write(week + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
