package baekjoon.bronze.no33541;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int year = sc.nextInt();
        System.out.println(findSpecialYear(year));
    }

    public static int findSpecialYear(int year) {
        for(int i = year+1; i < 10000; i++) {
            int front = i / 100;
            int back = i % 100;
            if(i == (front + back) * (front + back)) return i;
        }
        return -1;
    }
}
