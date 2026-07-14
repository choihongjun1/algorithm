package leetcode.easy.no766;

class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            int row = i;
            int col = 0;
            int val = matrix[row][col];

            while(row < matrix.length && col < matrix[0].length) {
                if(val != matrix[row][col]) return false;
                row++;
                col++;
            }
        }

        for(int i = 1; i < matrix[0].length; i++) {
            int row = 0;
            int col = i;
            int val = matrix[row][col];

            while(row < matrix.length && col < matrix[0].length) {
                if(val != matrix[row][col]) return false;
                row++;
                col++;
            }
        }

        return true;
    }
}
