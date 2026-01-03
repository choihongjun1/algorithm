package baekjoon.silver.no24419;

import java.io.*;
import java.math.BigInteger;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) br.readLine();

        bw.write(f(n) + " " + n*n);

        br.close();
        bw.flush();
        bw.close();
    }

    public static String f(int n) {
        BigInteger[][] arr = new BigInteger[n][n];
        for(int row = 0; row < n; row++) arr[row][0] = BigInteger.ONE;
        for(int col = 1; col < n; col++) arr[0][col] = BigInteger.ONE;
        for(int row = 1; row < n; row++) {
            for(int col = 1; col < n; col++) {
                arr[row][col] = arr[row-1][col].add(arr[row][col-1]);
            }
        }

        BigInteger sum = BigInteger.ZERO;
        for(int i = 0; i < n; i++) sum = sum.add(arr[i][n-1]).mod(new BigInteger("1000000007"));
        return sum.add(sum).mod(new BigInteger("1000000007")).toString();
    }

}
