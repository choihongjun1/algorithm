package baekjoon.silver.no1904;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        arr[0] = 1;
        if(n >= 2) arr[1] = 2;
        for(int i = 2; i < n; i++) {
            arr[i] = (arr[i-1] + arr[i-2]) % 15746;
        }

        bw.write(arr[n-1] + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
