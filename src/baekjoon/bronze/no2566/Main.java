package baekjoon.bronze.no2566;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[9][9];
        int max = 0;
        int maxRow = 1;
        int maxCol = 1;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = sc.nextInt();
                if(arr[i][j] > max) {
                    max = arr[i][j];
                    maxRow = i+1;
                    maxCol = j+1;
                }
            }
        }

        System.out.println(max);
        System.out.println(maxRow + " " + maxCol);
    }
}
