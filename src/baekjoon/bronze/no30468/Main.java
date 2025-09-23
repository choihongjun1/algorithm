package baekjoon.bronze.no30468;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i = 0; i < 4; i++) {
            sum += sc.nextInt();
        }
        int n = sc.nextInt();

        int blessing = 4 * n - sum;
        if(blessing < 0) blessing = 0;
        System.out.println(blessing);
    }
}
