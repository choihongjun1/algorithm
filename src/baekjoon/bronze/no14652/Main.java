package baekjoon.bronze.no14652;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int k = sc.nextInt();

        for(int r = 0; r < row; r++) {
            for(int c = 0; c < col; c++) {
                if(r * col + c == k) {
                    System.out.println(r + " " + c);
                    break;
                }
            }
        }

    }
}
