package baekjoon.silver.no9625;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int k = Integer.parseInt(br.readLine());
        int a = 1;
        int b = 0;

        for(int i = 0; i < k; i++) {
            int temp = b;
            b = a + b;
            a = temp;
        }

        bw.write(a + " " + b);

        br.close();
        bw.flush();
        bw.close();
    }
}
