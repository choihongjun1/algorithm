package baekjoon.silver.no11008;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] result = new int[t];
        for(int i = 0; i < t; i++) {
            int second = 0;
            String s = sc.next();
            String p = sc.next();
            while(s.contains(p)) {
                s = s.replaceFirst(p, "");
                second++;
            }
            second += s.length();
            result[i] = second;
        }

        for(int i = 0; i < t; i++) {
            System.out.println(result[i]);
        }
    }
}
