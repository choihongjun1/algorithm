package baekjoon.bronze.no2525;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int cookTime = sc.nextInt();

        minute += cookTime;

        if(minute > 59) {
            hour += minute / 60;
            minute %= 60;
        }

        if (hour > 23) {
            hour %= 24;
        }

        System.out.println(hour + " " + minute);

    }
}
