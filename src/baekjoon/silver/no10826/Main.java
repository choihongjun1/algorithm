package baekjoon.silver.no10826;

import java.io.*;
import java.math.BigInteger;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BigInteger[] arr;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        arr = new BigInteger[n+1];
        arr[0] = BigInteger.ZERO;
        if(n != 0) arr[1] = BigInteger.ONE;

        bw.write(fibo(n));

        br.close();
        bw.flush();
        bw.close();
    }

    public static String fibo(int n) {
        for(int i = 2; i <= n; i++) {
            arr[i] = arr[i-1].add(arr[i-2]);
        }
        return arr[n].toString();
    }
}
