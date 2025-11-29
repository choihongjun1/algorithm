package baekjoon.bronze.no34845;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += sc.nextInt();
        }

        int count = 0;
        while((n+count) * x > sum) {
            count++;
            sum += 100;
        }

        System.out.println(count);
    }
}
