package baekjoon.platinum.no13974;

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
            int[][] opt = new int[n][n];
            for(int j = 0; j < n; j++) {
                dp[j][j] = 0;
                opt[j][j] = j;
            }

            for(int len = 2; len <= n; len++) {
                for(int l = 0; l + len <= n; l++) {
                    int r = l + len - 1;

                    dp[l][r] = Integer.MAX_VALUE;

                    for(int k = opt[l][r-1]; k <= Math.min(r-1, opt[l+1][r]); k++) {
                        int cost = dp[l][k] + dp[k+1][r] + sum[r+1] - sum[l];
                        if(cost <= dp[l][r]) {
                            dp[l][r] = cost;
                            opt[l][r] = k;
                        }
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
