package baekjoon.bronze.no33572;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long m = sc.nextLong();
        for(int i = 0; i < n; i++) {
            m -= sc.nextLong() - 1;
            if(m <= 0) break;
        }
        if(m > 0) System.out.println("OUT");
        else System.out.println("DIMI");
    }
}
