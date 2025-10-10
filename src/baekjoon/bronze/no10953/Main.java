package baekjoon.bronze.no10953;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] sum = new int[t];
        for(int i = 0; i < t; i++) {
            String[] num = sc.next().split(",");
            sum[i] = Integer.parseInt(num[0]) + Integer.parseInt(num[1]);
        }

        for(int i = 0; i < t; i++) {
            System.out.println(sum[i]);
        }
    }
}
