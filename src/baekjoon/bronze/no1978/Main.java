package baekjoon.bronze.no1978;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(isPrime(sc.nextInt())) count++;
        }
        System.out.println(count);
    }

    public static boolean isPrime(int n) {
        if(n == 1) return false;
        for(int i = 2; i < n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
