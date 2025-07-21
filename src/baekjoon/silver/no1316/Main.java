package baekjoon.silver.no1316;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int groupWord = 0;
        for (int i = 0; i < n; i++) {
            if(isGroupWord(sc.next())) groupWord++;
        }
        System.out.println(groupWord);
    }

    public static boolean isGroupWord(String word) {
        boolean[] alphabet = new boolean[26];
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if(alphabet[index]) {
                if(word.charAt(i-1) != word.charAt(i)) return false;
            }
            alphabet[word.charAt(i) - 'a'] = true;
        }
        return true;
    }
}
