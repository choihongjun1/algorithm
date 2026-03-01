package baekjoon.silver.no27966;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        long n = Long.parseLong(br.readLine());
        bw.write((n-1) * (n-1) + "\n");
        for(int i = 2; i <= n; i++) {
            bw.write(1 + " " + i + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
