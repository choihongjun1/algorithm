package baekjoon.silver.no15904;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] ucpc = {'U', 'C', 'P', 'C'};
        String name = sc.nextLine();

        int totalIndex = 0;
        for(int i = 0; i < 4; i++) {
            int index = findChar(ucpc[i], name.substring(totalIndex));
            if(index == -1) {
                System.out.println("I hate UCPC");
                return;
            }
            totalIndex += index;
        }
        System.out.println("I love UCPC");
    }

    public static int findChar(char c, String s) {
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == c) return i;
        }
        return -1;
    }
}
