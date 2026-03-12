package baekjoon.silver.no24479;

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
    static int count = 0;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int node = Integer.parseInt(st.nextToken());
        int edge = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());
        adj = new ArrayList[node+1];
        visited = new int[node+1];
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

        dfs(start);

        for(int i = 1; i <= node; i++) {
            bw.write(visited[i] + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void dfs(int start) {
        visited[start] = ++count;
        for(int u : adj[start]) {
            if(visited[u] == 0) dfs(u);
        }
    }
}
