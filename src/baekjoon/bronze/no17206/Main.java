package baekjoon.bronze.no17206;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < t; i++) {
            int n = Integer.parseInt(st.nextToken());
            sb.append(sum(n, 3) + sum(n, 7) - sum(n, 21)).append("\n");
        }

        bw.write(sb.toString());

        br.close();
        bw.flush();
        bw.close();
    }

    public static int sum(int n, int k) {
        int q = n / k;
        return k * q * (q+1) / 2;
    }
}
