package baekjoon.silver.no1500;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        long max = 1;
        for(int i = 0; i < k - (s % k); i++) {
            max *= s / k;
        }
        for(int i = 0; i < s % k; i++) {
            max *= s / k + 1;
        }

        bw.write(max + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
