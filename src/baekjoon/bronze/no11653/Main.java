package baekjoon.bronze.no11653;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        if (n == 1) return;

        int prime = 2;
        while(!isPrime(n)) {
            if(n % prime == 0) {
                System.out.println(prime);
                n /= prime;
            }
            else { // 다음 소수
                prime++;
                while(!isPrime(prime)) {
                    prime++;
                }
            }
        }
        System.out.println(n);
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
