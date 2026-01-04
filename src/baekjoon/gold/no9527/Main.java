package baekjoon.gold.no9527;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static long[] arr;
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        int k = findK(b);
        arr = new long[k];
        arr[0] = 1;
        for(int i = 1; i < arr.length-1; i++) {
            arr[i] = arr[i-1] * 2 + (long)Math.pow(2, i); // 1 ~ 2^(i+1)-1
        }

        bw.write(f(b, k) - f(a-1, findK(a-1)) + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    public static long f(long n, int k) {
        if(n < 2) return n;

        long one = arr[k-2];
        long r = n - (long)Math.pow(2, k-1) + 1;
        one += r; // 맨 위
        one += f(r-1, findK(r-1));

        return one;
    }

    public static int findK(long n) {
        int k = 0;
        while(Math.pow(2, k) <= n) {
            k++;
        }
        return k;
    }
}
