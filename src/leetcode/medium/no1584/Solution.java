package leetcode.medium.no1584;

import java.util.*;

class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        boolean[] visited = new boolean[n];

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));

        pq.offer(new int[]{0, 0});
        int total = 0;

        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int u = cur[0];
            int cost = cur[1];

            if (visited[u]) continue;

            visited[u] = true;
            total += cost;

            for (int v = 0; v < n; v++) {
                if (!visited[v]) {
                    int dist = Math.abs(points[u][0] - points[v][0])
                            + Math.abs(points[u][1] - points[v][1]);

                    pq.offer(new int[]{v, dist});
                }
            }
        }

        return total;
    }
}
