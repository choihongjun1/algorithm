package baekjoon.silver.no3184;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int wolf = 0;
    static int sheep = 0;
    static boolean[][] visited;
    static char[][] map;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        map = new char[r][c];
        for(int i = 0; i < r; i++) {
            String line = br.readLine();
            for(int j = 0; j < c; j++) {
                map[i][j] = line.charAt(j);
            }
        }

        visited = new boolean[r][c];
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                if(map[i][j] != '#' && !visited[i][j]) bfs(i, j);
            }
        }

        bw.write(sheep + " " + wolf);

        br.close();
        bw.flush();
        bw.close();
    }

    public static void bfs(int r, int c) {
        int o = 0;
        int v = 0;

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {r, c});
        visited[r][c] = true;
        if(map[r][c] == 'o') o++;
        else if(map[r][c] == 'v') v++;

        while(!queue.isEmpty()) {
            int[] xy = queue.poll();
            for(int i = 0; i < 4; i++) {
                int x = xy[0] + dx[i];
                int y = xy[1] + dy[i];
                if(x < 0 || x >= map.length || y < 0 || y >= map[0].length) continue;
                if(visited[x][y]) continue;
                if(map[x][y] == '#') continue;

                queue.add(new int[] {x, y});
                visited[x][y] = true;
                if(map[x][y] == 'o') o++;
                else if(map[x][y] == 'v') v++;
            }
        }

        if(v >= o) wolf += v;
        else sheep += o;
    }
}
