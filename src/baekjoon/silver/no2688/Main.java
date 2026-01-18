package baekjoon.silver.no2688;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        long[][] arr = new long[65][10];
        arr[1][0] = 1;
        for(int i = 1; i < 10; i++) {
            arr[1][i] = arr[1][i-1] + 1;
        }

        for(int i = 2; i <= 64; i++) {
            arr[i][0] = 1;
            for(int j = 1; j < 10; j++) {
                arr[i][j] = arr[i-1][j] + arr[i][j-1];
            }
        }

        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            bw.write(arr[n][9] + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
