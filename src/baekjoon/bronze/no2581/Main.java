package baekjoon.bronze.no2581;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int m = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        int min = 10001;

        for(int i = m; i <= n; i++) {
            if(isPrime(i)) {
                sum += i;
                if(i < min) min = i;
            }
        }

        if(sum == 0) System.out.println(-1);
        else {
            System.out.println(sum);
            System.out.println(min);
        }
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
