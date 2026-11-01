package leetcode.medium.no743;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<int[]>[] adj = new List[n+1];
        for(int i = 1; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }

        for(int[] time : times) {
            adj[time[0]].add(new int[] {time[1], time[2]});
        }

        int[] dist = new int[adj.length];
        Arrays.fill(dist, Integer.MAX_VALUE);

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Long.compare(a[1], b[1]));

        dist[k] = 0;
        pq.offer(new int[] {k, 0});

        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int u = (int) cur[0];
            int d = cur[1];

            if (dist[u] < d) continue;

            for (int[] next : adj[u]) {
                int v = next[0];
                int w = next[1];

                if (dist[v] <= d + w) continue;

                dist[v] = d + w;
                pq.offer(new int[] {v, dist[v]});
            }
        }

        int delay = 0;
        for(int i = 1; i <= n; i++) {
            if(dist[i] == Integer.MAX_VALUE) return -1;
            delay = Math.max(delay, dist[i]);
        }

        return delay;
    }
}
