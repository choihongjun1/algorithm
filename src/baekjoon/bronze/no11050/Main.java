package baekjoon.bronze.no11050;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(combination(n, k));
    }

    public static long combination(int n, int k) {
        long result = 1;
        for(int i = n; i >= n-k+1; i--) {
            result *= i;
        }
        result /= factorial(k);
        return result;
    }

    public static long factorial(int n) {
        long result = 1;
        for(int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
