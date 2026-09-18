package leetcode.easy.no2923;

class Solution {
    public int findChampion(int[][] grid) {
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid.length; j++) {
                if(i == j) continue;
                if(grid[i][j] == 0) break;
                if(j == grid.length-1 && grid[i][j] == 1) return i;
            }
        }
        return grid.length-1;
    }
}
