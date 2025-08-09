package baekjoon.silver.no1359;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);
        int k = Integer.parseInt(line[2]);

        double prob = 0;
        for(int i = k; i <= m; i++) {
            prob += combination(n, i) * combination(n-i, m-i) * combination(n-m, m-i);
        }
        prob /= Math.pow(combination(n, m), 2);

        bw.write(prob + "\n");

        bw.flush();
        bw.close();
        br.close();
    }

    public static int combination(int n, int m) {
        if(n < m) return 0;
        if(m == 0) return 1;
        int result = 1;
        for(int i = n; i >= n-m+1; i--) {
            result *= i;
        }
        result /= factorial(m);
        return result;
    }

    public static int factorial(int n) {
        if(n <= 1) return 1;
        int result = 1;
        for(int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
