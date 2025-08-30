package baekjoon.bronze.no10757;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();
        String num2 = sc.next();

        System.out.println(plus(num1, num2));
    }

    public static String plus(String num1, String num2) {
        String sum = "";
        int len1 = num1.length();
        int len2 = num2.length();
        int min = Math.min(len1, len2);
        int max = Math.max(len1, len2);
        String larger = len1 >= len2 ? num1 : num2;
        boolean carry = false;

        for (int i = 0; i < max; i++) {
            if(i < min) {
                int digit1 = Integer.parseInt(num1.substring(len1 - 1 - i, len1 - i));
                int digit2 = Integer.parseInt(num2.substring(len2 - 1 - i, len2 - i));
                int digitSum = digit1 + digit2;
                if(carry) digitSum += 1;
                carry = (digitSum > 9);
                sum = (digitSum % 10) + sum;
            } else {
                int digit = Integer.parseInt(larger.substring(max - i - 1, max - i));
                if(carry) digit += 1;
                carry = (digit > 9);
                sum = (digit % 10) + sum;
            }

        }
        if(carry) sum = 1 + sum;

        return sum;
    }
}
