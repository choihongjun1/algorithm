package baekjoon.bronze.no3765;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String line = br.readLine();
        while(line != null) {
            bw.write(line + "\n");
            line = br.readLine();
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
