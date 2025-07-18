package baekjoon.bronze.no2420;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long n = sc.nextInt();
        long m = sc.nextInt();
        System.out.println(Math.abs(n-m));
    }
}
