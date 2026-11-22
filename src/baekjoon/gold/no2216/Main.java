package baekjoon.gold.no2216;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        String s1 = br.readLine();
        String s2 = br.readLine();
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];

        for(int i = 0; i < dp.length; i++) dp[i][0] = i*b;
        for(int j = 1; j < dp[0].length; j++) dp[0][j] = j*b;

        for(int i = 1; i < dp.length; i++) {
            for(int j = 1; j < dp[0].length; j++) {
                int match = s1.charAt(i-1) == s2.charAt(j-1) ? a : c;
                dp[i][j] = Math.max(dp[i-1][j] + b, dp[i][j-1] + b);
                dp[i][j] = Math.max(dp[i][j], dp[i-1][j-1] + match);
            }
        }

        bw.write(dp[s1.length()][s2.length()] + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
