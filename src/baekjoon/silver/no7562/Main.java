package baekjoon.silver.no7562;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int[] dx = {-2, -2, -1, -1, 1, 1, 2, 2};
    static int[] dy = {-1, 1, -2, 2, -2, 2, -1, 1};

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++) {
            int size = Integer.parseInt(br.readLine());
            int[][] map = new int[size][size];

            StringTokenizer st = new StringTokenizer(br.readLine());
            int currY = Integer.parseInt(st.nextToken());
            int currX = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int destY = Integer.parseInt(st.nextToken());
            int destX = Integer.parseInt(st.nextToken());

            if(currY == destY && currX == destX) bw.write("0\n");
            else {
                bfs(currY, currX, destY, destX, map);
                bw.write(map[destY][destX] + "\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void bfs(int currY, int currX, int destY, int destX, int[][] map) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {currY, currX});

        while(!queue.isEmpty()) {
            int[] cur = queue.poll();
            for(int i = 0; i < 8; i++) {
                int y = cur[0] + dy[i];
                int x = cur[1] + dx[i];
                if(x < 0 || y < 0 || x >= map.length || y >= map.length) continue;
                if(map[y][x] != 0) continue;
                if(x == cur[1] && y == cur[0]) continue;

                map[y][x] = map[cur[0]][cur[1]] + 1;
                queue.add(new int[] {y, x});
            }
        }
    }
}
