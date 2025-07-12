package baekjoon.bronze.no2444;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();

        for(int i = 1; i < 2*n; i++) {
            int star = i <= n ? 2*i-1 : -2*i+4*n-1;
            int space = (2*n-1 - star) / 2;
            System.out.println(" ".repeat(space) + "*".repeat(star));
        }
    }
}
