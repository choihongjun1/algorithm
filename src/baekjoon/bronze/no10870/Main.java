package baekjoon.bronze.no10870;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        System.out.println(fibo(n));
    }

    public static int fibo(int n) {
        if(n == 0 || n == 1) return n;
        return fibo(n-1) + fibo(n-2);
    }
}
