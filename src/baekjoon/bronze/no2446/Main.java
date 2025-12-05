package baekjoon.bronze.no2446;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < 2*n-1; i++) {
            if(i < n) {
                System.out.println(" ".repeat(i) + "*".repeat(2*n-1-2*i));
            } else {
                System.out.println(" ".repeat(2*n-2-i) + "*".repeat(2*i-2*n+3));
            }
        }
    }
}
