package baekjoon.silver.no11724;

import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static boolean[] visited;
    static List<Integer>[] adj;
    static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int node = Integer.parseInt(st.nextToken());
        int edge = Integer.parseInt(st.nextToken());
        visited = new boolean[node+1];
        adj = new ArrayList[node+1];
        for(int i = 1; i <= node; i++) {
            adj[i] = new ArrayList<>();
        }

        for(int i = 0; i < edge; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            adj[u].add(v);
            adj[v].add(u);
        }

        int connectedComponent = 0;
        int start;
        while((start = unvisitedNode()) != -1) {
            visited[start] = true;
            queue.add(start);
            bfs();
            connectedComponent++;
        }

        bw.write(connectedComponent + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void bfs() {
        while(!queue.isEmpty()) {
            int u = queue.poll();
            for(int i : adj[u]) {
                if(visited[i]) continue;
                visited[i] = true;
                queue.add(i);
            }
        }
    }

    public static int unvisitedNode() {
        for(int i = 1; i < visited.length; i++) {
            if(!visited[i]) return i;
        }
        return -1;
    }
}
