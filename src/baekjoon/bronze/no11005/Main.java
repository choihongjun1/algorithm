package baekjoon.bronze.no11005;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        String num = "";
        while(n > 0) {
            int index = n % b;
            char digit = getDigit(index);
            num = digit + num;
            n /= b;
        }
        System.out.println(num);
    }

    public static char getDigit(int index) {
        if(index < 10) return (char)('0' + index);
        return (char)(index - 10 + 'A');
    }
}
