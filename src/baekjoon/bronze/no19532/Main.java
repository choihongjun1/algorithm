package baekjoon.bronze.no19532;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();

        for(int x = -999; x <= 999; x++) {
            for(int y = -999; y <= 999; y++) {
                if(a*x + b*y == c && d*x + e*y == f) {
                    System.out.println(x + " " + y);
                    return;
                }
            }
        }
    }
}
