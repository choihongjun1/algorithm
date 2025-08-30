package baekjoon.silver.no2740;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix1 = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                matrix1[i][j] = sc.nextInt();
            }
        }

        sc.nextInt();
        int k = sc.nextInt();
        int[][] matrix2 = new int[m][k];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < k; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        int[][] mul = new int[n][k];
        int[][] transpose = t(matrix2);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < k; j++) {
                mul[i][j] = innerProduct(matrix1[i], transpose[j]);
            }
        }

        for(int i = 0; i < n; i++) {
            String row = "";
            for(int j = 0; j < k; j++) {
                row += mul[i][j] + " ";
            }
            System.out.println(row.trim());
        }

    }

    public static int innerProduct(int[] v1, int[] v2) {
        int result = 0;
        for(int i = 0; i < v1.length; i++) {
            result += v1[i] * v2[i];
        }
        return result;
    }

    public static int[][] t(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] result = new int[col][row];
        for(int i = 0; i < col; i++) {
            for(int j = 0; j < row; j++) {
                result[i][j] = matrix[j][i];
            }
        }

        return result;
    }
}
