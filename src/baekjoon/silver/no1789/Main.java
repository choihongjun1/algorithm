package baekjoon.silver.no1789;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        long s = Long.parseLong(br.readLine());
        for(int i = 1; ; i++) {
            s -= i;
            if(s <= i) {
                bw.write(i + "\n");
                break;
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
