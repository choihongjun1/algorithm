package baekjoon.silver.no24417;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        long fibo = 0;
        long prev1 = 1;
        long prev2 = 1;
        for(int i = 3; i <= n; i++) {
            fibo = prev1 + prev2;
            fibo %= 1000000007;
            prev2 = prev1;
            prev1 = fibo;
        }

        bw.write(fibo + " " + (n-2));

        br.close();
        bw.flush();
        bw.close();
    }
}
