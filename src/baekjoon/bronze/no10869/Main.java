package baekjoon.bronze.no10869;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        if (b != 0) {
            System.out.println(a / b);
            System.out.println(a % b);
        }

    }
}

