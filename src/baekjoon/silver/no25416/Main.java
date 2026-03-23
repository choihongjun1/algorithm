package baekjoon.silver.no25416;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int[][] map = new int[5][5];
    static int[][] visited = new int[5][5];
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        for(int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 5; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        bw.write(bfs(r, c) + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    public static int bfs(int r, int c) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{r, c});
        visited[r][c] = 1;

        while(!queue.isEmpty()) {
            int[] curr = queue.poll();

            for(int i = 0; i < 4; i++) {
                int y = curr[0] + dy[i];
                int x = curr[1] + dx[i];

                if(y < 0 || x < 0 || y >= map.length || x >= map[0].length) continue;
                if(map[y][x] == -1) continue;
                if(visited[y][x] > 0) continue;
                visited[y][x] = visited[curr[0]][curr[1]] + 1;
                if(map[y][x] == 1) return visited[y][x] - 1;
                queue.add(new int[]{y, x});
            }
        }

        return -1;
    }
}
