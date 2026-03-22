package baekjoon.silver.no2583;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};
    static int area = 0;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        boolean[][] map = new boolean[row][col];

        for(int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            for(int r = row-y2; r <= row-1-y1; r++) {
                for(int c = x1; c <= x2-1; c++) {
                    map[r][c] = true;
                }
            }
        }

        int count = 0;
        List<Integer> list = new ArrayList<>();
        for(int r = 0; r < row; r++) {
            for(int c = 0; c < col; c++) {
                if(!map[r][c]) {
                    dfs(r, c, map);
                    count++;
                    list.add(area);
                    area = 0;
                }
            }
        }
        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        sb.append(count).append('\n');
        for(int a : list) sb.append(a).append(' ');
        bw.write(sb.toString().trim());

        br.close();
        bw.flush();
        bw.close();
    }

    public static void dfs(int r, int c, boolean[][] map) {
        map[r][c] = true;
        area++;

        for(int i = 0; i < 4; i++) {
            int x = c + dx[i];
            int y = r + dy[i];
            if(x < 0 || x >= map[0].length || y < 0 || y >= map.length) continue;
            if(map[y][x]) continue;
            dfs(y, x, map);
        }
    }
}
