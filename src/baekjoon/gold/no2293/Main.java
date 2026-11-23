package baekjoon.gold.no2293;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] coins = new int[n];
        for(int i = 0; i < n; i++) coins[i] = Integer.parseInt(br.readLine());

        int[] dp = new int[k+1];
        dp[0] = 1;

        for(int coin : coins) {
            for(int i = coin; i <= k; i++) {
                dp[i] += dp[i-coin];
            }
        }

        bw.write(dp[k] + "");

        br.close();
        bw.flush();
        bw.close();
    }
}
