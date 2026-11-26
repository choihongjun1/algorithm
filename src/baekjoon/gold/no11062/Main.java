package baekjoon.gold.no11062;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            int[][][] dp = new int[n][n][2];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            for(int j = 0; j < n; j++) {
                dp[j][j][0] = arr[j];
                dp[j][j][1] = 0;
            }

            for(int len = 2; len <= n; len++) {
                for(int l = 0; l + len <= n; l++) {
                    int r = l + len - 1;

                    dp[l][r][0] = Math.max(arr[l] + dp[l+1][r][1], arr[r] + dp[l][r-1][1]);
                    dp[l][r][1] = Math.min(dp[l+1][r][0], dp[l][r-1][0]);
                }
            }

            bw.write(dp[0][n-1][0] + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
