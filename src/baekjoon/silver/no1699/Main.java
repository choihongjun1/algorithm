package baekjoon.silver.no1699;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];
        arr[1] = 1;
        for(int i = 2; i <= n; i++) {
            arr[i] = arr[i-1] + 1;
            int sq = 2;
            while(sq * sq <= i) {
                arr[i] = Math.min(arr[i], arr[i - sq*sq] + 1);
                sq++;
            }
        }

        bw.write(arr[n] + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
