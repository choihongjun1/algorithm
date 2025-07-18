package baekjoon.bronze.no4999;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str1 = sc.next();
        String str2 = sc.next();
        if(str1.length() >= str2.length()) System.out.println("go");
        else System.out.println("no");
    }
}
