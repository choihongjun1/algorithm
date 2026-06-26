package leetcode.easy.no3898;

class Solution {
    public int[] findDegrees(int[][] matrix) {
        int[] result = new int[matrix.length];
        for(int i = 0; i < matrix.length; i++) {
            for(int j = i + 1; j < matrix.length; j++) {
                if(matrix[i][j] == 1) {
                    result[i]++;
                    result[j]++;
                }
            }
        }
        return result;
    }
}
