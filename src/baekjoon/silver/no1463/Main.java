package baekjoon.silver.no1463;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];
        arr[1] = 0;
        if(n >= 2) arr[2] = 1;
        if(n >= 3) arr[3] = 1;

        for(int i = 4; i <= n; i++) {
            if(i % 6 == 0) {
                arr[i] = 1 + Math.min(arr[i-1], Math.min(arr[i/3], arr[i/2]));
            }
            else if(i % 3 == 0) {
                arr[i] = 1 + Math.min(arr[i-1], arr[i/3]);
            }
            else if(i % 2 == 0) {
                arr[i] = 1 + Math.min(arr[i-1], arr[i/2]);
            } else {
                arr[i] = 1 + arr[i-1];
            }
        }

        bw.write(arr[n] + "\n");

        bw.flush();
        bw.close();
        br.close();
    }

}
