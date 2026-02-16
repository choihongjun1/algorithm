package baekjoon.silver.no12785;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        long[][] arr = new long[w+1][h+1];
        for(int i = 1; i <= w; i++) arr[i][1] = 1;
        for(int i = 2; i <= h; i++) arr[1][i] = 1;

        for(int i = 2; i <= w; i++) {
            for(int j = 2; j <= h; j++) {
                arr[i][j] = (arr[i-1][j] + arr[i][j-1]) % 1000007;
            }
        }

        bw.write((arr[x][y] * arr[w-x+1][h-y+1]) % 1000007 + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
