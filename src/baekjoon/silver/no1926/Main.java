package baekjoon.silver.no1926;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static boolean[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 0, 0, 1};
    static int[] dy = {0, -1, 1, 0};

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        map = new boolean[r][c];
        visited = new boolean[r][c];
        for(int i = 0; i < r; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < c; j++) {
                map[i][j] = st.nextToken().equals("1");
            }
        }

        int image = 0;
        int max = 0;
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                if(map[i][j] && !visited[i][j]) {
                    image++;
                    max = Math.max(bfs(i, j), max);
                }
            }
        }
        bw.write(image + "\n");
        bw.write(max + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    public static int bfs(int r, int c) {
        int size = 0;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {r, c});
        visited[r][c] = true;
        size++;

        while(!queue.isEmpty()) {
            int[] cur = queue.poll();
            for(int i = 0; i < 4; i++) {
                int y = cur[0] + dy[i];
                int x = cur[1] + dx[i];
                if(y < 0 || x < 0 || y >= map.length || x >= map[0].length) continue;
                if(!map[y][x]) continue;
                if(visited[y][x]) continue;

                visited[y][x] = true;
                queue.add(new int[] {y, x});
                size++;
            }
        }

        return size;
    }
}
