package baekjoon.bronze.no28701;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int sum = 0;
        int sumOfCube = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
            sumOfCube += i*i*i;
        }
        System.out.println(sum);
        System.out.println(sum * sum);
        System.out.println(sumOfCube);
    }
}
