package baekjoon.silver.no2941;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String word = sc.next();
        int wordCount = word.length(); // 단어 수
        for(int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if(i > 0) {
                if(c == '=') {
                    if(word.charAt(i-1) == 's' || word.charAt(i-1) == 'c') wordCount--;
                    if(word.charAt(i-1) == 'z') {
                        wordCount--;
                        if(i > 1 && word.charAt(i-2) == 'd') wordCount--;
                    }
                } else if(c == '-') {
                    if(word.charAt(i-1) == 'c' || word.charAt(i-1) == 'd') wordCount--;
                } else if(c == 'j') {
                    if(word.charAt(i-1) == 'n' || word.charAt(i-1) == 'l') wordCount--;
                }
            }
        }

        System.out.println(wordCount);
    }
}
