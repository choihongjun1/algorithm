package baekjoon.bronze.no28113;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a < b) System.out.println("Bus");
        else if(a == b) System.out.println("Anything");
        else System.out.println("Subway");
    }
}
