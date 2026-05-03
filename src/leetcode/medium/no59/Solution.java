package leetcode.medium.no59;

class Solution {
    public int[][] generateMatrix(int n) {
        final int RIGHT = 0;
        final int DOWN = 1;
        final int LEFT = 2;
        final int UP = 3;
        int direction = RIGHT;

        int[][] matrix = new int[n][n];
        int count = 1;

        int row = 0;
        int col = 0;
        while(count <= n * n) {
            matrix[row][col] = count++;

            switch(direction) {
                case RIGHT:
                    if(col+1 >= n || matrix[row][col+1] != 0) direction = DOWN;
                    break;
                case DOWN:
                    if(row+1 >= n || matrix[row+1][col] != 0) direction = LEFT;
                    break;
                case LEFT:
                    if(col-1 < 0 || matrix[row][col-1] != 0) direction = UP;
                    break;
                case UP:
                    if(row-1 < 0 || matrix[row-1][col] != 0) direction = RIGHT;
                    break;
            }

            switch(direction) {
                case RIGHT:
                    col++;
                    break;
                case DOWN:
                    row++;
                    break;
                case LEFT:
                    col--;
                    break;
                case UP:
                    row--;
                    break;
            }
        }

        return matrix;
    }
}
