package baekjoon.silver.no1065;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i = 1; i <= n; i++) {
            if(hansu(i)) count++;
        }
        System.out.println(count);
    }

    public static boolean hansu(int n) {
        if(n < 100) return true;
        String s = String.valueOf(n);
        int prev = Integer.parseInt(s.substring(0, 1));
        int digit = Integer.parseInt(s.substring(1, 2));
        int d = prev - digit;
        for(int i = 1; i < s.length()-1; i++) {
            prev = digit;
            digit = Integer.parseInt(s.substring(i+1, i+2));
            if(prev - digit != d) return false;
        }
        return true;
    }
}
