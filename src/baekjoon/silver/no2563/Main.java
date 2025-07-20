package baekjoon.silver.no2563;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean[][] arr = new boolean[100][100];
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            int row = sc.nextInt();
            int col = sc.nextInt();
            for(int x = 0; x < 10; x++) {
                for(int y = 0; y < 10; y++) {
                    arr[row+x][col+y] = true;
                }
            }
        }

        int area = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if(arr[i][j]) area++;
            }
        }

        System.out.println(area);
    }
}
