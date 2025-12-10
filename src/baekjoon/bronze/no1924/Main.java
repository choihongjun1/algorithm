package baekjoon.bronze.no1924;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int sum = sc.nextInt();

        for(int i = 0; i < month-1; i++) {
            sum += months[i];
        }

        System.out.println(days[sum%7]);
    }
}
