package baekjoon.silver.no2579;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] stair = new int[n];
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for(int i = 0; i < n; i++) {
            stair[i] = Integer.parseInt(br.readLine());
        }

        arr1[0] = stair[0];
        arr2[0] = stair[0];
        if(n > 1) {
            arr1[1] = stair[1] + stair[0];
            arr2[1] = stair[1];
        }
        for(int i = 2; i < n; i++) {
            arr1[i] = stair[i] + arr2[i-1];
            arr2[i] = stair[i] + Math.max(arr1[i-2], arr2[i-2]);
        }

        bw.write(Math.max(arr1[n-1], arr2[n-1]) + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
