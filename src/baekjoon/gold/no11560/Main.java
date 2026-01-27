package baekjoon.gold.no11560;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            long[] coef = new long[n+1];
            long[] prev = new long[n+1];
            coef[0] = 1;
            prev[0] = 1;
            if(n > 0) prev[1] = 1;

            for(int j = 2; j <= k; j++) {
                for(int x = 1; x <= Math.min(n, j*(j+1)/2); x++) {
                    for(int y = 0; y <= x; y++) {
                        if(x-y <= j) coef[x] += prev[y];
                    }
                }

                for(int x = 1; x <= Math.min(n, j*(j+1)/2); x++) {
                    prev[x] = coef[x];
                    coef[x] = 0;
                }
            }

            bw.write(prev[n] + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
