package baekjoon.bronze.no10162;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        if(time % 10 != 0) {
            System.out.println(-1);
            return;
        }

        int a = time / 300;
        time %= 300;
        int b = time / 60;
        time %= 60;
        int c = time / 10;

        System.out.println(a + " " + b + " " + c);
    }
}
