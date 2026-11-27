package baekjoon.bronze.no11049;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] row = new int[n];
        int[] col = new int[n];

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            row[i] = Integer.parseInt(st.nextToken());
            col[i] = Integer.parseInt(st.nextToken());
        }

        int[][] dp = new int[n][n];
        for(int len = 2; len <= n; len++) {
            for(int l = 0; l + len <= n; l++) {
                int r = l + len - 1;

                dp[l][r] = Integer.MAX_VALUE;
                for(int k = l; k < r; k++) {
                    int cost = dp[l][k] + dp[k+1][r] + row[l]*col[k]*col[r];
                    dp[l][r] = Math.min(dp[l][r], cost);
                }
            }
        }

        bw.write(dp[0][n-1] + "");

        br.close();
        bw.flush();
        bw.close();
    }
}
