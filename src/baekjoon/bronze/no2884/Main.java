package baekjoon.bronze.no2884;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int hour = sc.nextInt();
        int minute = sc.nextInt();

        minute = minute - 45;
        if(minute < 0) {
            minute += 60;
            hour--;
            if(hour < 0) hour = 23;
        }

        System.out.println(hour + " " + minute);
    }
}
