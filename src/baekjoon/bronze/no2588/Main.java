package baekjoon.bronze.no2588;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.println(n1 * (n2 % 10));
        System.out.println(n1 * ((n2 / 10) % 10));
        System.out.println(n1 * (n2 / 100));
        System.out.println(n1 * n2);
    }
}
