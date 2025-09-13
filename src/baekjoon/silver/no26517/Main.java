package baekjoon.silver.no26517;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        long lLim = (long)a * k + b;
        long rLim = (long)c * k + d;

        if(lLim == rLim) System.out.println("Yes " + lLim);
        else System.out.println("No");
    }
}
