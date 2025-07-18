package baekjoon.bronze.no2576;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int sum = 0;
        int min = 100;

        for(int i = 0; i < 7; i++) {
            int num = sc.nextInt();
            if(num % 2 != 0) {
                sum += num;
                if(num < min) min = num;
            }
        }

        if(sum != 0) {
            System.out.println(sum);
            System.out.println(min);
        } else {
            System.out.println(-1);
        }
    }
}
