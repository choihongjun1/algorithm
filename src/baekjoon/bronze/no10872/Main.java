package baekjoon.bronze.no10872;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }

    public static long factorial(int n) {
        if(n <= 1) return 1;
        long result = 1;
        for(int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
