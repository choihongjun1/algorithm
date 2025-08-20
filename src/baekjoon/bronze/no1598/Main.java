package baekjoon.bronze.no1598;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int row = Math.abs((int)Math.ceil(b / 4.0) - (int)Math.ceil(a / 4.0));
        int col = Math.abs(((b % 4 == 0) ? 4 : b % 4) - ((a % 4 == 0) ? 4 : a % 4));
        System.out.println(row + col);
    }
}
