package baekjoon.silver.no23253;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        for(int i = 0; i < m; i++) {
            int k = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            int prev = Integer.parseInt(st.nextToken());
            for(int j = 1; j < k; j++) {
                int num = Integer.parseInt(st.nextToken());
                if(num >= prev) {
                    bw.write("No\n");

                    br.close();
                    bw.flush();
                    bw.close();
                    System.exit(0);
                }

                prev = num;
            }
        }

        bw.write("Yes\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
