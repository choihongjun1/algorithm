package baekjoon.silver.no24484;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static List<Integer>[] adj;
    static int[] visited;
    static int[] depth;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int node = Integer.parseInt(st.nextToken());
        int edge = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());
        adj = new ArrayList[node+1];
        visited = new int[node+1];
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
            adj[i].sort(Collections.reverseOrder());
        }

        dfs(start, 0);

        long sum = 0;
        for(int i = 1; i <= node; i++) {
            sum += (long)depth[i] * visited[i];
        }
        bw.write(sum + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void dfs(int start, int d) {
        visited[start] = ++count;
        depth[start] = d;
        for(int u : adj[start]) {
            if(visited[u] == 0) dfs(u, d+1);
        }
    }
}
