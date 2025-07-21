package baekjoon.bronze.no11720;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        String num = sc.next();
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += Integer.parseInt(String.valueOf(num.charAt(i)));
        }
        System.out.println(sum);
    }
}
