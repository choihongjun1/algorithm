package baekjoon.silver.no9047;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] result = new int[n];
        for(int i = 0; i < n; i++) {
            String number = sc.next();
            int count = 0;
            while(!number.equals("6174")) {
                number = kaprekar(number);
                count++;
            }
            result[i] = count;
        }

        for(int i = 0; i < n; i++) {
            System.out.println(result[i]);
        }
    }

    public static String kaprekar(String number) {
        int count = 0;
        char[] digit = new char[4];
        for(int i = 0; i < 4; i++) {
            digit[i] = number.charAt(i);
        }
        Arrays.sort(digit);

        String max = "";
        String min = "";

        for(int i = 0; i < digit.length; i++) {
            min += digit[i];
            max += digit[digit.length-1-i];
        }

        String diff = String.valueOf(Integer.parseInt(max) - Integer.parseInt(min));
        if(diff.length() < 4) {
            diff = "0".repeat(4-diff.length()) + diff;
        }
        return diff;
    }
}
