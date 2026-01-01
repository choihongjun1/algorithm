package baekjoon.silver.no24228;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());
        long r = Long.parseLong(st.nextToken());
        bw.write(n-1+2*r + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
