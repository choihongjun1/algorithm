package baekjoon.silver.no1260;

import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb;
    static List<Integer>[] adj;
    static boolean[] visited;
    static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());
        adj = new ArrayList[n+1];
        visited = new boolean[n+1];
        for(int i = 0; i < adj.length; i++) {
            adj[i] = new ArrayList<>();
        }

        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            adj[a].add(b);
            adj[b].add(a);
        }

        for(int i = 1; i < adj.length; i++) {
            Collections.sort(adj[i]);
        }

        sb = new StringBuilder();
        sb.append(start).append(" ");
        visited[start] = true;
        dfs(start);
        bw.write(sb.toString().trim() + "\n");

        sb = new StringBuilder();
        sb.append(start).append(" ");
        visited = new boolean[n+1];
        visited[start] = true;
        queue.add(start);
        bfs();
        bw.write(sb.toString().trim());

        br.close();
        bw.flush();
        bw.close();
    }

    public static void dfs(int start) {
        for(int i : adj[start]) {
            if(visited[i]) continue;
            visited[i] = true;
            sb.append(i).append(" ");
            dfs(i);
        }
    }

    public static void bfs() {
        while(!queue.isEmpty()) {
            int u = queue.poll();

            for(int v : adj[u]) {
                if(visited[v]) continue;
                sb.append(v).append(" ");
                visited[v] = true;
                queue.add(v);
            }
        }
    }
}
