package baekjoon.gold.no1707;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static List<Integer>[] graph;
    static int[] color;

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            graph = new List[v+1];
            color = new int[v+1];
            for(int j = 1; j <= v; j++) {
                graph[j] = new ArrayList<>();
                color[j] = -1;
            }

            for(int j = 0; j < e; j++) {
                st = new StringTokenizer(br.readLine());
                int u1 = Integer.parseInt(st.nextToken());
                int u2 = Integer.parseInt(st.nextToken());
                graph[u1].add(u2);
                graph[u2].add(u1);
            }

            boolean isBipartite = true;
            for(int j = 1; j <= v; j++) {
                if(color[j] == -1) {
                    if(!dfs(j, 1)) {
                        isBipartite = false;
                        break;
                    }
                }
            }

            bw.write(isBipartite ? "YES\n" : "NO\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    static boolean dfs(int v, int c) {
        color[v] = c;

        for(int next : graph[v]) {
            if(color[next] == -1) {
                if(!dfs(next, 1 - c)) {
                    return false;
                }
            } else if(color[next] == c) {
                return false;
            }
        }

        return true;
    }
}
