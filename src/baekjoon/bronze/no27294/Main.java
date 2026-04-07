package baekjoon.bronze.no27294;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int s = sc.nextInt();
        if(h >= 12 && h <= 16 && s == 0) System.out.println(320);
        else System.out.println(280);
    }
}
