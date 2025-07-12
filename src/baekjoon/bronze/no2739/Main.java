package baekjoon.bronze.no2739;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.println(n + " * " + i + " = " + (n*i));
        }
    }
}
