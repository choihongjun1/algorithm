package baekjoon.silver.no14492;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean[][] matrix1 = new boolean[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++){
                matrix1[i][j] = sc.nextInt() == 1;
            }
        }

        boolean[][] matrix2 = new boolean[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++) {
                matrix2[i][j] = sc.nextInt() == 1;
            }
        }

        boolean[][] mul = new boolean[n][n];
        boolean[][] transpose = t(matrix2);
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                mul[i][j] = innerProduct(matrix1[i], transpose[j]);
            }
        }

        int count = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(mul[i][j]) count++;
            }
        }
        System.out.println(count);

    }

    public static boolean innerProduct(boolean[] v1, boolean[] v2) {
        boolean result = false;
        for(int i = 0; i < v1.length; i++) {
            result = result || (v1[i] && v2[i]);
            if(result) break;
        }
        return result;
    }

    public static boolean[][] t(boolean[][] matrix) {
        int n = matrix.length;
        boolean[][] result = new boolean[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                result[i][j] = matrix[j][i];
            }
        }

        return result;
    }
}

