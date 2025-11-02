package baekjoon.silver.no14490;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.next().split(":");
        int a = Integer.parseInt(line[0]);
        int b = Integer.parseInt(line[1]);

        for(int i = Math.min(a, b); i >= 1; i--) {
            if(a % i == 0 && b % i == 0) {
                a /= i;
                b /= i;
                break;
            }
        }

        System.out.println(a + ":" + b);
    }
}
