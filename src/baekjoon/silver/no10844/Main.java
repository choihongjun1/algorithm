package baekjoon.silver.no10844;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        long[][] arr = new long[n+1][10];
        for(int i = 0; i < 10; i++) {
            arr[1][i] = 1;
        }

        for(int i = 2; i <= n; i++) {
            for(int j = 0; j < 10; j++) {
                if(j != 0) arr[i][j] = (arr[i][j] + arr[i-1][j-1]) % 1000000000;
                if(j != 9) arr[i][j] = (arr[i][j] + arr[i-1][j+1]) % 1000000000;
            }
        }

        long sum = 0;
        for(int i = 1; i <= 9; i++) {
            sum += arr[n][i];
            sum %= 1000000000;
        }
        bw.write(sum + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
