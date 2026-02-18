package baekjoon.silver.no16174;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[][] map = new int[n][n];
        boolean[][] visited = new boolean[n][n];
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        visited[0][0] = true;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(visited[i][j]) {
                    if(i + map[i][j] < n) visited[i + map[i][j]][j] = true;
                    if(j + map[i][j] < n) visited[i][j + map[i][j]] = true;
                }
            }
        }

        if(visited[n-1][n-1]) bw.write("HaruHaru");
        else bw.write("Hing");

        br.close();
        bw.flush();
        bw.close();
    }
}
