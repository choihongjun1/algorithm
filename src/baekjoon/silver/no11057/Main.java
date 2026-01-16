package baekjoon.silver.no11057;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n+1][10];
        arr[1][0] = 1;
        for(int i = 1; i < 10; i++) {
            arr[1][i] = arr[1][i-1] + 1;
        }

        for(int i = 2; i <= n; i++) {
            arr[i][0] = 1;
            for(int j = 1; j < 10; j++) {
                arr[i][j] = arr[i][j-1] + arr[i-1][j];
                arr[i][j] %= 10007;
            }
        }

        bw.write(arr[n][9] + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
