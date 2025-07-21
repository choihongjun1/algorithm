package baekjoon.bronze.no5622;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String number = sc.next();
        int second = 0;
        for(int i = 0; i < number.length(); i++) {
            int c = number.charAt(i)-'A';
            if(c >= 'S'-'A') c--;
            if(c >= 'Y'-'A') c--;
            c -= c % 3;
            c /= 3;
            c += 2;
            second += c+1;
        }
        System.out.println(second);
    }
}
