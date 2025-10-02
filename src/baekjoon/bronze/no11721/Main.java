package baekjoon.bronze.no11721;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        for(int i = 0; i < n / 10; i++) {
            System.out.println(s.substring(i * 10, i * 10 + 10));
        }
        System.out.println(s.substring(n - n % 10, n));
    }
}
