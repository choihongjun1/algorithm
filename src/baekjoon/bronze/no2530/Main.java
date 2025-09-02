package baekjoon.bronze.no2530;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int second = sc.nextInt();
        second += sc.nextInt();
        if(second > 59) {
            minute += second / 60;
            second %= 60;
        }
        if(minute > 59) {
            hour += minute / 60;
            minute %= 60;
        }
        if(hour > 23) {
            hour %= 24;
        }
        System.out.println(hour + " " + minute + " " + second);
    }
}
