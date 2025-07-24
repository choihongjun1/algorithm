package baekjoon.bronze.no5522;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int sum = 0;
        for(int i = 0; i < 5; i++) {
            sum += sc.nextInt();
        }
        System.out.println(sum);
    }
}
