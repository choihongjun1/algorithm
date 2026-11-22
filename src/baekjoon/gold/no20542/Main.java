package baekjoon.gold.no20542;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String s1 = br.readLine();
        String s2 = br.readLine();
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];

        for(int i = 0; i < dp.length; i++) dp[i][0] = i;
        for(int j = 1; j < dp[0].length; j++) dp[0][j] = j;

        for(int i = 1; i < dp.length; i++) {
            for(int j = 1; j < dp[0].length; j++) {
                int match = 1;
                if(s1.charAt(i-1) == s2.charAt(j-1)) match = 0;
                else if(s1.charAt(i-1) == 'i' && s2.charAt(j-1) == 'j') match = 0;
                else if(s1.charAt(i-1) == 'i' && s2.charAt(j-1) == 'l') match = 0;
                else if(s1.charAt(i-1) == 'v' && s2.charAt(j-1) == 'w') match = 0;

                dp[i][j] = Math.min(dp[i-1][j] + 1, dp[i][j-1] + 1);
                dp[i][j] = Math.min(dp[i][j], dp[i-1][j-1] + match);
            }
        }

        bw.write(dp[s1.length()][s2.length()] + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}