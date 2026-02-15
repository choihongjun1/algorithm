package baekjoon.silver.no2705;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int[] arr = new int[1001];
        arr[0] = 1;
        arr[1] = 1;
        for(int i = 2; i <= 1000; i++) {
            for(int j = i % 2; j <= i; j += 2) {
                arr[i] += arr[(i-j)/2];
            }
        }

        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            bw.write(arr[n] + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
