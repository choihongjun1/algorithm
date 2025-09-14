package baekjoon.bronze.no2745;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int b = sc.nextInt();
        int num = 0;
        for(int i = 0; i < n.length(); i++) {
            char c = n.charAt(n.length()-1-i);
            num += getDec(c) * Math.pow(b, i);
        }
        System.out.println(num);
    }

    public static int getDec(char c) {
        if(c >= '0' && c <= '9') return c - '0';
        return c - 'A' + 10;
    }
}
