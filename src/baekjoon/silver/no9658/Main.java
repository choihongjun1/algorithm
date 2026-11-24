package baekjoon.silver.no9658;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        boolean[] win = new boolean[n + 1];
        int[] num = {1, 3, 4};
        win[0] = true;

        for(int i = 1; i <= n; i++) {
            for(int k : num) {
                if(i >= k) win[i] |= !win[i-k];
            }
        }

        if(win[n]) bw.write("SK");
        else bw.write("CY");

        br.close();
        bw.flush();
        bw.close();
    }
}
