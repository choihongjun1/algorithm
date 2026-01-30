package baekjoon.bronze.no20492;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        bw.write(n / 100 * 78 + " " + n / 1000 * 956);
        br.close();
        bw.flush();
        bw.close();
    }
}
