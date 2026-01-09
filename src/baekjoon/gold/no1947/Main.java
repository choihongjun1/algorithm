package baekjoon.gold.no1947;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        long[] arr = new long[n+1];
        if(n >= 2) arr[2] = 1;
        for(int i = 3; i <= n; i++) {
            arr[i] = (i-1) * ((arr[i-1] + arr[i-2]) % 1000000000);
            arr[i] %= 1000000000;
        }

        bw.write(arr[n] + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

}
