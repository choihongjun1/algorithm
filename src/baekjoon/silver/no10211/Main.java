package baekjoon.silver.no10211;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        for(int x = 0; x < t; x++) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

            int max = arr[0];
            int[] dp = new int[n];
            dp[0] = arr[0];
            for(int i = 1; i < n; i++) {
                dp[i] = Math.max(dp[i-1] + arr[i], arr[i]);
                max = Math.max(max, dp[i]);
            }

            bw.write(max + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}

