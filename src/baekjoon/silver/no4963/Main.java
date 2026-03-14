package baekjoon.silver.no4963;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        String size = br.readLine();
        while(!size.equals("0 0")) {
            StringTokenizer st = new StringTokenizer(size);
            int w = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());

            int island = 0;
            boolean[][] map = new boolean[h+2][w+2];
            for(int i = 1; i <= h; i++) {
                st = new StringTokenizer(br.readLine());
                for(int j = 1; j <= w; j++) {
                    map[i][j] = st.nextToken().equals("1");
                }
            }

            for(int i = 1; i <= h; i++) {
                for(int j = 1; j <= w; j++) {
                    if(map[i][j]) {
                        map[i][j] = false;
                        dfs(map, i, j);
                        island++;
                    }
                }
            }
            bw.write(island + "\n");

            size = br.readLine();
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void dfs(boolean[][] map, int x, int y) {
        for(int i = x-1; i <= x+1; i++) {
            for(int j = y-1; j <= y+1; j++) {
                if(i == x && j == y) continue;
                if(map[i][j]) {
                    map[i][j] = false;
                    dfs(map, i, j);
                }
            }
        }
    }
}
