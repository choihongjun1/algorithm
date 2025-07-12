package baekjoon.bronze.no5554;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();

        int total = n1 + n2 + n3 + n4;

        int minute = total / 60;
        int second = total % 60;

        if ((total >= 60) && (total < 3600)) {
            System.out.println(minute);
            System.out.println(second);
        }
    }
}