package baekjoon.gold.no1344;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int[] prime = {2, 3, 5, 7, 11, 13, 17};
        double pA = Double.parseDouble(br.readLine()) / 100;
        double pB = Double.parseDouble(br.readLine()) / 100;
        double a = 0;
        double b = 0;

        for(int n : prime) {
            a += combination(18, n) * Math.pow(pA, n) * Math.pow(1-pA, 18-n);
            b += combination(18, n) * Math.pow(pB, n) * Math.pow(1-pB, 18-n);
        }

        double p = a + b - a * b;
        bw.write(p + "\n");

        bw.flush();
        bw.close();
        br.close();
    }

    public static long combination(int n, int k) {
        long result = 1;
        for(int i = n; i >= n-k+1; i--) {
            result *= i;
        }
        result /= factorial(k);
        return result;
    }

    public static long factorial(int n) {
        long result = 1;
        for(int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
