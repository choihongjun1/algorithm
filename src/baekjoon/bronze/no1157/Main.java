package baekjoon.bronze.no1157;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String word = sc.next().toUpperCase();
        int[] alphabet = new int[26];
        int max = 0;
        for(int i = 0; i < word.length(); i++) {
            int index = word.charAt(i)-65;
            alphabet[index]++;
            if(alphabet[index] > max) max = alphabet[index];
        }

        int count = 0;
        char mostUsed = '?';
        for(int i = 0; i < alphabet.length; i++) {
            if(alphabet[i] == max) {
                mostUsed = (char)(i + 65);
                count++;
            }
        }
        if(count == 1) System.out.println(mostUsed);
        else System.out.println("?");
    }
}
