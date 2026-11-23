package baekjoon.gold.no9084;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] coins = new int[n];
            for(int j = 0; j < n; j++) coins[j] = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(br.readLine());

            int[] dp = new int[k+1];
            dp[0] = 1;

            for(int coin : coins) {
                for(int c = coin; c <= k; c++) {
                    dp[c] += dp[c-coin];
                }
            }

            bw.write(dp[k] + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
