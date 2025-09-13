package baekjoon.silver.no26518;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int b = sc.nextInt();
        int c = sc.nextInt();
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();

        double S = (b + Math.sqrt((long)b * b + (long)4 * c)) / 2.0;
        System.out.println(S);
    }
}
