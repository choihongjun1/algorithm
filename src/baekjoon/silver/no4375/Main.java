package baekjoon.silver.no4375;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String line = br.readLine();
        while(line != null) {
            int n = Integer.parseInt(line);
            int r = 0;
            for(int i = 1; ; i++) {
                r = (r * 10 + 1) % n;
                if(r == 0) {
                    bw.write(i + "\n");
                    break;
                }
            }
            line = br.readLine();
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
