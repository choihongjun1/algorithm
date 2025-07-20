package baekjoon.bronze.no2501;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) k--;
            if(k == 0) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
}
