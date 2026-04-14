package baekjoon.bronze.no2845;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int l = sc.nextInt();
        int p = sc.nextInt();
        for(int i = 0; i < 5; i++) {
            System.out.print(sc.nextInt() - l*p + " ");
        }
    }
}
