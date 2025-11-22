package baekjoon.silver.no27674;

import java.io.*;
import java.util.Arrays;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        long[] result = new long[t];
        for(int i = 0; i < t; i++) {
            br.readLine();
            result[i] = maxSum(br.readLine());
        }

        for(int i = 0; i < t; i++) bw.write(result[i] + "\n");

        bw.flush();
        bw.close();
        br.close();
    }

    public static long maxSum(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        String a = "";
        for(int i = s.length() - 1; i >= 1; i--) {
            a += arr[i];
        }
        return Long.parseLong(a) + Integer.parseInt(String.valueOf(arr[0]));
    }
}
