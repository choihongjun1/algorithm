package baekjoon.silver.no1676;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int num = 5;
        int count = 0;
        while(n >= num) {
            count += n / num;
            num *= 5;
        }

        bw.write(count + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
