package baekjoon.bronze.no2292;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int x = 1;
        int y = 1;
        int max = 1; // 거리 d까지 저장된 가장 큰 수
        int d = 1; // 거리

        while(n > max) {
            x += 1;
            y += 2;
            max += 2*x + 2*y - 4;
            d++;
        }

        System.out.println(d);

    }
}
