package baekjoon.silver.no7113;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(cut(n, m));
    }

    public static int cut(int n, int m) {
        if(n == m) return 1;
        return 1 + cut(Math.max(n, m)-Math.min(n, m), Math.min(n, m));
    }
}
