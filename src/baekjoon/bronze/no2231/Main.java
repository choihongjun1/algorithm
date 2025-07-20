package baekjoon.bronze.no2231;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();

        for(int i = 1; i < n; i++) {
            if(disassemble(i) == n) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }

    // 분해합 구하기
    public static int disassemble(int n) {
        int sum = n;
        int digit = n % 10;
        while(digit != 0) {
            sum += digit;
            n /= 10;
            digit = n % 10;
        }
        return sum;
    }
}
