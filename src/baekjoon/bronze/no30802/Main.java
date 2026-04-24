package baekjoon.bronze.no30802;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] size = new int[6];
        for(int i = 0; i < size.length; i++) {
            size[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        int p = sc.nextInt();

        int sum = 0;
        for(int i = 0; i < size.length; i++) {
            sum += Math.ceil(size[i] / (double)t);
        }
        System.out.println(sum);
        System.out.println(n/p + " " + n%p);
    }
}
