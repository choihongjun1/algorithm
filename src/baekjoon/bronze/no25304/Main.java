package baekjoon.bronze.no25304;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int total = sc.nextInt();
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            int cost = sc.nextInt();
            int amount = sc.nextInt();
            total -= cost * amount;
        }

        if(total == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
