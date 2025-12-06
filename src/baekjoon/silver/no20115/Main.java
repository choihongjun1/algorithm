package baekjoon.silver.no20115;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        double drink = 0;
        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if(max < num) max = num;
            drink += num / 2.0;
        }
        drink += max / 2.0;

        System.out.println(drink);
    }
}
