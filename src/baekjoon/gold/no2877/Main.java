package baekjoon.gold.no2877;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        int pow = 1;
        while(k > 0) {
            k -= Math.pow(2, pow);
            pow++;
        }
        pow--;
        k += Math.pow(2, pow);
        k--;

        String num = "";
        while(k > 0) {
            num = ((k % 2 == 0) ? "4" : "7") + num;
            k /= 2;
        }
        if(num.length() < pow) num = "4".repeat(pow - num.length()) + num;

        System.out.println(num);
    }
}
