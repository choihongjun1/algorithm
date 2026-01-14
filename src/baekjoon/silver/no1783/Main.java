package baekjoon.silver.no1783;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int count = 0;

        if(c >= 7) {
            if(r >= 3) {
                count = c-2;
            } else if(r == 2) {
                count = 4;
            } else {
                count = 1;
            }
        } else {
            if(r >= 3) {
                if(c <= 4) count = c;
                else count = 4;
            } else if(r == 2) {
                if(c < 3) count = 1;
                else if(c < 5) count = 2;
                else count = 3;
            } else {
                count = 1;
            }
        }

        bw.write(count + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
