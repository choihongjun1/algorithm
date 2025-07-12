package baekjoon.no1008;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (b != 0) {
            System.out.println((double) a / b);
        }
    }
}
