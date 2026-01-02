package baekjoon.silver.no24418;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) br.readLine();

        bw.write(f(n) + " " + n*n);

        br.close();
        bw.flush();
        bw.close();
    }

    public static int f(int n) {
        int[][] arr = new int[n][n];
        for(int row = 0; row < n; row++) arr[row][0] = 1;
        for(int col = 1; col < n; col++) arr[0][col] = 1;
        for(int row = 1; row < n; row++) {
            for(int col = 1; col < n; col++) {
                arr[row][col] = arr[row-1][col] + arr[row][col-1];
            }
        }

        int sum = 0;
        for(int i = 0; i < n; i++) sum += arr[i][n-1];
        return 2 * sum;
    }
}
