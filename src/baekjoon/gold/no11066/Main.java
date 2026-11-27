package baekjoon.gold.no11066;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] sum = new int[n+1];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) {
                sum[j+1] = sum[j] + Integer.parseInt(st.nextToken());
            }

            int[][] dp = new int[n][n];
            for(int len = 2; len <= n; len++) {
                for(int l = 0; l + len <= n; l++) {
                    int r = l + len - 1;

                    dp[l][r] = Integer.MAX_VALUE;
                    for(int k = l; k < r; k++) {
                        int cost = dp[l][k] + dp[k+1][r] + sum[r+1] - sum[l];
                        dp[l][r] = Math.min(dp[l][r], cost);
                    }
                }
            }

            bw.write(dp[0][n-1] + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}

