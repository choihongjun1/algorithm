package baekjoon.bronze.no2744;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        for(int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if(c < 97) c += 32;
            else c -= 32;
            System.out.print(c);
        }
    }
}
