package leetcode.medium.no1329;

import java.util.Arrays;

class Solution {
    public int[][] diagonalSort(int[][] mat) {
        for(int r = 0; r < mat.length; r++) {
            int[] arr = new int[Math.min(mat.length - r, mat[0].length)];
            for(int i = 0; i < arr.length; i++) {
                arr[i] = mat[r+i][i];
            }

            Arrays.sort(arr);
            for(int i = 0; i < arr.length; i++) {
                mat[r+i][i] = arr[i];
            }
        }

        for(int c = 1; c < mat[0].length; c++) {
            int[] arr = new int[Math.min(mat[0].length - c, mat.length)];
            for(int i = 0; i < arr.length; i++) {
                arr[i] = mat[i][c+i];
            }

            Arrays.sort(arr);
            for(int i = 0; i < arr.length; i++) {
                mat[i][c+i] = arr[i];
            }
        }

        return mat;
    }
}
