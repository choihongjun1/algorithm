package baekjoon.silver.no2606;

import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static boolean[] visited;
    static List<Integer>[] adj;
    static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int edge = Integer.parseInt(br.readLine());
        adj = new ArrayList[n+1];
        for(int i = 1; i <= n; i++) adj[i] = new ArrayList<>();
        visited = new boolean[n+1];

        for(int i = 0; i < edge; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            adj[u].add(v);
            adj[v].add(u);
        }

        queue.add(1);
        visited[1] = true;

        bw.write(bfs() + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    public static int bfs() {
        int count = 0;
        while(!queue.isEmpty()) {
            int u = queue.poll();
            for(int v : adj[u]) {
                if(visited[v]) continue;
                visited[v] = true;
                count++;
                queue.add(v);
            }
        }

        return count;
    }
}
