package baekjoon.bronze.no9085;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        int[] result = new int[t];
        for(int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int sum = 0;
            for(int j = 0; j < n; j++) {
                sum += sc.nextInt();
            }
            result[i] = sum;
        }
        for(int i : result) {
            System.out.println(i);
        }
    }
}
