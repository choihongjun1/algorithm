package baekjoon.bronze.no2754;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String gpa = sc.next();
        if(gpa.equals("F")) {
            System.out.println(0.0);
            return;
        }

        double score = 4.0 - (gpa.charAt(0) - 'A');
        if(gpa.charAt(1) == '+') score += 0.3;
        else if(gpa.charAt(1) == '-') score -= 0.3;
        System.out.println(score);
    }
}
