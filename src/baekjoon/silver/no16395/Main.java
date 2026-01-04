package baekjoon.silver.no16395;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][n];

        for(int i = 0; i < n; i++) {
            arr[i][0] = 1;
            arr[i][i] = 1;
        }

        for(int i = 2; i < n; i++) {
            for(int j = 1; j < n-1; j++) {
                arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
            }
        }

        bw.write(arr[n-1][k-1] + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
