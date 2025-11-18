package baekjoon.silver.no31714;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        int[][] std = new int[n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                std[i][j] = sc.nextInt() + (i + 1) * d;
            }
        }

        for(int i = 0; i < n; i++) {
            Arrays.sort(std[i]);
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n-1; j++) {
                if(std[j][i] >= std[j+1][i]) {
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");
    }
}
