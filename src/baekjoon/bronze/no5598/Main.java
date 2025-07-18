package baekjoon.bronze.no5598;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str = sc.next();
        String result = "";

        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            c = (char)(c - 3);
            if(c < 65) c += 26;
            result += c;
        }

        System.out.println(result);
    }
}
