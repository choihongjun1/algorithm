package baekjoon.silver.no2780;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        long[] pwd = new long[1001];
        long[][] dp = new long[1001][10];
        List<Integer>[] adj = new ArrayList[10];
        for(int i = 0; i < 10; i++) adj[i] = new ArrayList<>();

        for(int i = 1; i <= 8; i++) {
            if(i % 3 != 0) {
                adj[i].add(i+1);
                adj[i+1].add(i);
            }
        }
        for(int i = 1; i <= 6; i++) {
            adj[i].add(i+3);
            adj[i+3].add(i);
        }
        adj[0].add(7);
        adj[7].add(0);

        for(int i = 0; i < 10; i++) {
            dp[1][i] = 1;
        }
        pwd[1] = 10;
        for(int i = 2; i <= 1000; i++) {
            for(int j = 0; j < 10; j++) {
                for(int k : adj[j]) {
                    dp[i][j] = (dp[i][j] + dp[i-1][k]) % 1234567;
                }
            }

            for(int j = 0; j < 10; j++) {
                pwd[i] = (pwd[i] + dp[i][j]) % 1234567;
            }
        }

        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            bw.write(pwd[n] + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
