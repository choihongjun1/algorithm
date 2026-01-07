package baekjoon.silver.no2193;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        if(n <= 2) {
            bw.write("1");
            br.close();
            bw.flush();
            bw.close();
            return;
        }

        long[] arr = new long[n+1];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 1;
        long sum = 2;
        for(int i = 3; i < arr.length; i++) {
            arr[i] = sum;
            sum += arr[i-1];
        }

        bw.write(arr[n] + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
