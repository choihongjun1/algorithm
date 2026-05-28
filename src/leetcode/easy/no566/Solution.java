package leetcode.easy.no566;

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if(m * n != r * c) return mat;

        int[][] res = new int[r][c];
        int count = 0;
        while(count < r * c) {
            res[count/c][count%c] = mat[count/n][count%n];
            count++;
        }

        return res;
    }
}
