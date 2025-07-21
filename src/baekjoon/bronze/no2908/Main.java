package baekjoon.bronze.no2908;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String num1 = sc.next();
        String num2 = sc.next();
        String reverseNum1 = "";
        String reverseNum2 = "";

        for(int i = 0; i < 3; i++) {
            reverseNum1 += String.valueOf(num1.charAt(2-i));
            reverseNum2 += String.valueOf(num2.charAt(2-i));
        }

        if(Integer.parseInt(reverseNum1) > Integer.parseInt(reverseNum2)) {
            System.out.println(reverseNum1);
        } else {
            System.out.println(reverseNum2);
        }
    }
}
