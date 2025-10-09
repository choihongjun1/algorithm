package baekjoon.bronze.no10808;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] alphabet = new int[26];
        String s = sc.next();
        for(int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            alphabet[index]++;
        }

        for(int i = 0; i < alphabet.length; i++) {
            System.out.print(alphabet[i]);
            if(i != alphabet.length - 1) System.out.print(" ");
        }
    }
}
