package baekjoon.bronze.no2742;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        for(int i = n; i >= 1; i--) {
            bw.write(i + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
