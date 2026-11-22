package baekjoon.gold.no11404;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int[][] dp = new int[n+1][n+1];

        for(int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
            dp[i][i] = 0;
        }

        for(int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            dp[start][end] = Math.min(cost, dp[start][end]);
        }

        for(int k = 1; k <= n; k++) {
            for(int i = 1; i <= n; i++) {
                for(int j = 1; j <= n; j++) {
                    if(dp[i][k] == Integer.MAX_VALUE || dp[k][j] == Integer.MAX_VALUE) continue;
                    dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k][j]);
                }
            }
        }

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n-1; j++) {
                bw.write((dp[i][j] == Integer.MAX_VALUE ? 0 : dp[i][j]) + " ");
            }
            bw.write((dp[i][n] == Integer.MAX_VALUE ? 0 : dp[i][n]) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
