package baekjoon.bronze.no24883;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c = sc.next();
        if(c.equals("N") || c.equals("n")) System.out.println("Naver D2");
        else System.out.println("Naver Whale");
    }
}
