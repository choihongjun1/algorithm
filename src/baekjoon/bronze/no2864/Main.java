package baekjoon.bronze.no2864;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        int max = Integer.parseInt(a.replace("5", "6")) + Integer.parseInt(b.replace("5", "6"));
        int min = Integer.parseInt(a.replace("6", "5")) + Integer.parseInt(b.replace("6", "5"));
        System.out.println(min + " " + max);
    }
}
