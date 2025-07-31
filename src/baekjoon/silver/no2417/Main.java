package baekjoon.silver.no2417;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        long n = Long.parseLong(br.readLine());
        bw.write(findSqrt(n) + "\n");

        bw.flush();
        bw.close();
        br.close();
    }

    public static long findSqrt(long n) {
        long left = -1;
        long right = n;
        while(left + 1 < right) {
            long mid = (left + right) / 2;
            if(Math.pow(mid, 2) < n) left = mid;
            else right = mid;
        }
        return right;
    }
}
