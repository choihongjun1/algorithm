package leetcode.medium.no64;

class Solution {
    public int minPathSum(int[][] grid) {
        for(int col = 1; col < grid[0].length; col++) {
            grid[0][col] = grid[0][col] + grid[0][col-1];
        }

        for(int row = 1; row < grid.length; row++) {
            grid[row][0] = grid[row][0] + grid[row-1][0];
        }

        for(int i = 1; i < grid.length; i++) {
            for(int j = 1; j < grid[0].length; j++) {
                grid[i][j] = grid[i][j] + Math.min(grid[i-1][j], grid[i][j-1]);
            }
        }

        return grid[grid.length-1][grid[0].length-1];
    }
}
