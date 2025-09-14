package baekjoon.gold.no26217;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double E = 0;
        for(int i = n; i >= 1; i--) {
            E += (double)n / i;
        }
        System.out.println(E);
    }
}
