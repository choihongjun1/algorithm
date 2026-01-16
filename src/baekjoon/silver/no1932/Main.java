package baekjoon.silver.no1932;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        int max = 0;
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n+1];
        for(int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= i; j++) {
                arr[i-1][j] = Integer.parseInt(st.nextToken());
                if(i > 1) arr[i-1][j] = arr[i-1][j] + Math.max(arr[i-2][j], arr[i-2][j-1]);
                if(i == n && arr[i-1][j] > max) max = arr[i-1][j];
            }
        }

        bw.write(max + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
