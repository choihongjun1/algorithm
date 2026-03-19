package baekjoon.silver.no12761;

import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static boolean[] visited;
    static Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        visited = new boolean[100001];

        if(n == m) bw.write("0\n");
        else {
            int count = bfs(a, b, n, m);
            bw.write(count + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static int bfs(int a, int b, int n, int m) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(n);
        visited[n] = true;
        map.put(n, 0);

        while(!queue.isEmpty()) {
            int curr = queue.poll();

            int[] next = new int[]{curr+1, curr-1, curr+a, curr-a, curr+b, curr-b, curr*a, curr*b};

            for(int i = 0; i < next.length; i++) {
                if(next[i] >= 0 && next[i] < visited.length) {
                    if(visited[next[i]]) continue;
                    visited[next[i]] = true;
                    queue.add(next[i]);
                    map.put(next[i], map.get(curr) + 1);
                }
            }

            if(visited[m]) break;
        }

        return map.get(m);
    }
}
