package baekjoon.silver.no9095;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int[] arr = new int[11];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 4;
        for(int i = 3; i < arr.length; i++) {
            arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
        }

        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            bw.write(arr[n-1] + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
