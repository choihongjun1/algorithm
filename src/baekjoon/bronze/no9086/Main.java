package baekjoon.bronze.no9086;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int test = sc.nextInt();
        String[] result = new String[test];
        for(int i = 0; i < test; i++) {
            String word = sc.next();
            result[i] = String.valueOf(word.charAt(0)) + word.charAt(word.length() - 1);
        }
        for(String s : result) System.out.println(s);
    }
}
