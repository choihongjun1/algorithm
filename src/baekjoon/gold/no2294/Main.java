package baekjoon.gold.no2294;

import java.io.*;
import java.util.Arrays;
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
        Arrays.fill(dp, -1);
        dp[0] = 0;

        for(int i = 1; i <= k; i++) {
            for(int coin : coins) {
                if(i - coin >= 0 && dp[i-coin] != -1) {
                    if(dp[i] == -1) dp[i] = dp[i-coin] + 1;
                    else dp[i] = Math.min(dp[i], dp[i-coin] + 1);
                }
            }
        }

        bw.write(dp[k] + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
