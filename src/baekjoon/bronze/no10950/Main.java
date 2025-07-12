package baekjoon.bronze.no10950;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        int[] sum = new int[t];

        for(int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            sum[i] = a + b;
        }

        for(int i : sum) {
            System.out.println(i);
        }
    }
}
