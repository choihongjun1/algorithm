package baekjoon.silver.no24446;

import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static List<Integer>[] adj;
    static boolean[] visited;
    static int[] depth;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int node = Integer.parseInt(st.nextToken());
        int edge = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());
        adj = new ArrayList[node+1];
        visited = new boolean[node+1];
        depth = new int[node+1];
        for(int i = 1; i <= node; i++) adj[i] = new ArrayList<>();

        for(int i = 0; i < edge; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            adj[u].add(v);
            adj[v].add(u);
        }

        for(int i = 1; i <= node; i++) {
            Collections.sort(adj[i]);
        }

        bfs(start);

        for(int i = 1; i <= node; i++) {
            if(visited[i]) bw.write(depth[i] + "\n");
            else bw.write("-1\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        depth[start] = 0;

        while(!queue.isEmpty()) {
            int u = queue.poll();
            for(int v : adj[u]) {
                if(!visited[v]) {
                    visited[v] = true;
                    depth[v] = depth[u] + 1;
                    queue.add(v);
                }
            }
        }
    }
}
