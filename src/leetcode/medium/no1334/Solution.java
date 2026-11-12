package leetcode.medium.no1334;

import java.util.Arrays;

class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] d = new int[n][n];
        for(int i = 0; i < n; i++) {
            Arrays.fill(d[i], 10001);
            d[i][i] = 0;
        }

        for(int[] edge : edges) {
            int from = edge[0];
            int to = edge[1];
            int w = edge[2];
            d[from][to] = w;
            d[to][from] = w;
        }

        for(int k = 0; k < n; k++) {
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j]);
                }
            }
        }

        int min = n;
        int smallestNeighbor = 0;
        for(int i = 0; i < n; i++) {
            int neighbour = 0;
            for(int j = 0; j < n; j++) {
                if(i != j && d[i][j] <= distanceThreshold) {
                    neighbour++;
                }
            }

            if(neighbour <= min) {
                smallestNeighbor = i;
                min = neighbour;
            }
        }

        return smallestNeighbor;
    }
}
