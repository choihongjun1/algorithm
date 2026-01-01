package baekjoon.silver.no2004;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int c2 = countk(n, 2) - countk(n-m, 2) - countk(m, 2);
        int c5 = countk(n, 5) - countk(n-m, 5) - countk(m, 5);

        bw.write(Math.min(c2, c5) + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    public static int countk(int n, int k) {
        long base = k;
        int count = 0;
        while(base <= n) {
            count += n / base;
            base *= k;
        }
        return count;
    }
}
