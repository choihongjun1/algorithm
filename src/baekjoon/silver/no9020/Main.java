package baekjoon.silver.no9020;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        String[] result = new String[t];
        for(int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            for(int j = n/2; j >= 2; j--) {
                if(isPrime(j) && isPrime(n-j)) {
                    result[i] = j + " " + (n-j);
                    break;
                }
            }
        }

        for(String s : result) bw.write(s + "\n");

        bw.flush();
        br.close();
        bw.close();
    }

    public static boolean isPrime(int n) {
        if(n <= 1) return false;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
}
