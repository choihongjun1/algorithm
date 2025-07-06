package baekjoon.no5585;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = 1000 - sc.nextInt(); // 거스름돈
        int total = 0; // 총 매수
        int[] arr = {500, 100, 50, 10, 5, 1}; // 거스름돈 단위

        if ((money > 0) && (money < 1000)) {
            for (int i : arr) {
                int count = money / i;
                money = money % i;
                total += count;
            }
        }

        System.out.println(total);
    }
}

