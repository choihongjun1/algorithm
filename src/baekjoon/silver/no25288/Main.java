package baekjoon.silver.no25288;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        bw.write(s.repeat(n));
        br.close();
        bw.flush();
        bw.close();
    }
}
