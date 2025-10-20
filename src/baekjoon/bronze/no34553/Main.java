package baekjoon.bronze.no34553;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int score = 1;
        int sum = 1;
        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i - 1) < s.charAt(i)) {
                score++;
            } else {
                score = 1;
            }
            sum += score;
        }
        System.out.println(sum);
    }
}
