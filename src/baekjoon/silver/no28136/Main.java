package baekjoon.silver.no28136;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start = sc.nextInt();
        int prev = start;
        int count = 0;
        for(int i = 1; i < n; i++) {
            int num = sc.nextInt();
            if(num <= prev) count++;
            prev = num;
        }
        if(start <= prev) count++;

        System.out.println(count);
    }
}
