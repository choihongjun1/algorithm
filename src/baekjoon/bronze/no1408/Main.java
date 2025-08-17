package baekjoon.bronze.no1408;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] currentTime = sc.nextLine().split(":");
        String[] startTime = sc.nextLine().split(":");

        int currentSecond = Integer.parseInt(currentTime[0]) * 3600 + Integer.parseInt(currentTime[1]) * 60 + Integer.parseInt(currentTime[2]);
        int startSecond = Integer.parseInt(startTime[0]) * 3600 + Integer.parseInt(startTime[1]) * 60 + Integer.parseInt(startTime[2]);

        int time = startSecond - currentSecond;
        if(time < 0) time += 86400;

        int hour = time / 3600;
        int minute = time % 3600 / 60;
        int second = time % 60;

        String hourString = String.valueOf(hour);
        if(hour < 10) hourString = "0" + hourString;
        String minuteString = String.valueOf(minute);
        if(minute < 10) minuteString = "0" + minuteString;
        String secondString = String.valueOf(second);
        if(second < 10) secondString = "0" + secondString;

        System.out.println(hourString + ":" + minuteString + ":" + secondString);
    }
}
