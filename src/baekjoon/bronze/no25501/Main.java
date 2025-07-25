package baekjoon.bronze.no25501;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int recursionCount = 0;

    public static void main(String[] args) {
        int t = sc.nextInt();
        String[] result = new String[t];
        for (int i = 0; i < t; i++) {
            String str = sc.next();
            result[i] = isPalindrome(str) + " " + recursionCount;
            recursionCount = 0;
        }
        for(String s : result) System.out.println(s);
    }

    public static int isPalindrome(String s) {
        return recursion(s, 0, s.length() - 1);
    }

    public static int recursion(String s, int l, int r) {
        recursionCount++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
}
