package baekjoon.bronze.no10156;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();

        int money = k * n - m;
        if(money < 0) money = 0;

        System.out.println(money);
    }
}
