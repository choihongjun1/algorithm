package baekjoon.silver.no9996;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String pattern = sc.next();
        boolean[] result = new boolean[n];

        String[] split = splitStar(pattern);
        String prefix = split[0];
        String suffix = split[1];
        for(int i = 0; i < n; i++) {
            String filename = sc.next();
            result[i] = check(prefix, suffix, filename);
        }

        for(int i = 0; i < n; i++) {
            if(result[i]) System.out.println("DA");
            else System.out.println("NE");
        }
    }

    public static String[] splitStar(String pattern) {
        String[] split = new String[2];
        String prefix = "";
        String suffix = "";
        boolean star = false;
        for(int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if(c == '*') {
                star = true;
                continue;
            }
            if(!star) prefix += c;
            else suffix += c;
        }

        split[0] = prefix;
        split[1] = suffix;
        return split;
    }

    public static boolean check(String prefix, String suffix, String filename) {
        if(prefix.length() + suffix.length() > filename.length()) return false;
        boolean b1 = prefix.equals(filename.substring(0, prefix.length()));
        boolean b2 = suffix.equals(filename.substring(filename.length()-suffix.length()));
        return b1 && b2;
    }
}
