package leetcode.easy.no1030;

import java.util.*;

class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] res = new int[rows * cols][2];
        int idx = 0;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                res[idx++] = new int[]{r, c};
            }
        }

        Arrays.sort(res, (a, b) -> {
            int distA = Math.abs(a[0] - rCenter) + Math.abs(a[1] - cCenter);
            int distB = Math.abs(b[0] - rCenter) + Math.abs(b[1] - cCenter);
            return Integer.compare(distA, distB);
        });

        return res;
    }
}
