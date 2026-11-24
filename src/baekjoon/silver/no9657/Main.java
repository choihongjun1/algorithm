package baekjoon.silver.no9657;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        boolean[] win = new boolean[n + 1];
        int[] num = {1, 3, 4};
        for(int k : num) {
            if(k <= n) win[k] = true;
        }

        for(int i = 5; i <= n; i++) {
            for(int k : num) {
                win[i] |= !win[i-k];
            }
        }

        if(win[n]) bw.write("SK");
        else bw.write("CY");

        br.close();
        bw.flush();
        bw.close();
    }
}
