package leetcode.medium.no973;

import java.util.PriorityQueue;

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        if(k > points.length) return points;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        for(int[] point : points) {
            int d = point[0] * point[0] + point[1] * point[1];
            pq.offer(new int[] {d, point[0], point[1]});
        }

        int[][] res = new int[k][2];
        for(int i = 0; i < k; i++) {
            int[] p = pq.poll();
            res[i][0] = p[1];
            res[i][1] = p[2];
        }

        return res;
    }
}
