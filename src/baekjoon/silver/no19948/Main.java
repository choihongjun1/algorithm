package baekjoon.silver.no19948;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String poem = sc.nextLine();
        int space = sc.nextInt() + 1;
        int[] alphabet = new int[26];
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = sc.nextInt();
        }

        String title = "";
        String[] tokens = poem.split(" ");
        for(String token : tokens) {
            if(!token.isEmpty()) {
                space--;
                if(space < 0) {
                    System.out.println(-1);
                    return;
                }
                title += token.substring(0, 1).toUpperCase();

                if(!alphabetCount(token, alphabet)) {
                    System.out.println(-1);
                    return;
                }
            }
        }
        if(!alphabetCount(title, alphabet)) {
            System.out.println(-1);
            return;
        }

        System.out.println(title);
    }

    public static boolean alphabetCount(String word, int[] alphabet) {
        char prev = word.charAt(0);
        for(int j = 0; j < word.length(); j++) {
            char c = word.charAt(j);
            if(j != 0 && c == prev) continue;
            int index = 0;
            if(c >= 'a' && c <= 'z') {
                index = c - 'a';
            } else if(c >= 'A' && c <= 'Z') {
                index = c - 'A';
            }

            alphabet[index]--;
            if(alphabet[index] < 0) {
                return false;
            }

            prev = c;
        }

        return true;
    }
}
