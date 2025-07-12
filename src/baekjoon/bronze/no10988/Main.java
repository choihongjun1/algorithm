package baekjoon.bronze.no10988;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String word = sc.next();

        for(int i = 0; i < word.length() / 2; i++) {
            if(word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                System.out.println(0);
                return;
            }
        }
        System.out.println(1);
    }
}