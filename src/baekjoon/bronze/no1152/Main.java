package baekjoon.bronze.no1152;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] words = sc.nextLine().trim().split(" ");
        if(words.length == 1 && words[0].length() == 0) System.out.println(0);
        else System.out.println(words.length);
    }
}
