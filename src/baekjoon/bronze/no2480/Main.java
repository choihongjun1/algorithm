package baekjoon.bronze.no2480;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int prize = 0;

        if(a == b && a == c) {
            prize = 10000 + 1000 * a;
        } else if(a == b || a == c) {
            prize = 1000 + 100 * a;
        } else if(b == c) {
            prize = 1000 + 100 * b;
        } else {
            prize = 100 * Math.max(a, Math.max(b, c));
        }

        System.out.println(prize);
    }
}
