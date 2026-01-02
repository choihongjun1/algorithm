package baekjoon.silver.no28438;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        int[] row = new int[n+1];
        int[] col = new int[m+1];

        for(int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine());
            if(st.nextToken().equals("1")) {
                int r = Integer.parseInt(st.nextToken());
                row[r] += Integer.parseInt(st.nextToken());
            } else {
                int c = Integer.parseInt(st.nextToken());
                col[c] += Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m-1; j++) {
                bw.write(row[i] + col[j] + " ");
            }
            bw.write(row[i] + col[m] + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
