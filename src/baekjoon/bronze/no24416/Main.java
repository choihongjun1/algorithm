package baekjoon.bronze.no24416;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        long[] fibo = new long[n+1];
        fibo[1] = 1;
        fibo[2] = 1;
        for(int i = 3; i <= n; i++) {
            fibo[i] = fibo[i-1] + fibo[i-2];
        }

        bw.write(fibo[n] + " " + (n-2));

        br.close();
        bw.flush();
        bw.close();
    }
}
