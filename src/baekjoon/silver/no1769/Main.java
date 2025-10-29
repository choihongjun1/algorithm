package baekjoon.silver.no1769;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();

        int count = 0;
        while(number.length() > 1) {
            number = digitSum(number);
            count++;
        }

        System.out.println(count);
        if(Integer.parseInt(number) % 3 == 0) System.out.println("YES");
        else System.out.println("NO");
    }

    public static String digitSum(String number) {
        int sum = 0;
        for(int i = 0; i < number.length(); i++) {
            int digit = Integer.parseInt(String.valueOf(number.charAt(i)));
            sum += digit;
        }
        return String.valueOf(sum);
    }
}
