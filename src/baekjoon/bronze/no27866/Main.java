package baekjoon.bronze.no27866;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String word = sc.next();
        int i = sc.nextInt();
        System.out.println(word.charAt(i-1));
    }
}
