package baekjoon.silver.no14430;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int[][] arr = new int[r+1][c+1];

        for(int i = 1; i <= r; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= c; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 1; i <= r; i++) {
            for(int j = 1; j <= c; j++) {
                arr[i][j] = arr[i][j] + Math.max(arr[i-1][j], arr[i][j-1]);
            }
        }

        bw.write(arr[r][c] + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
