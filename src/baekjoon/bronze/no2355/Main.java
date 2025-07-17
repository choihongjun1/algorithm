package baekjoon.bronze.no2355;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long a = sc.nextInt();
        long b = sc.nextInt();
        long larger;
        long smaller;
        long result;

        if(a * b >= 0) {
            larger = (Math.abs(a) >= Math.abs(b)) ? a : b;
            smaller = (Math.abs(a) >= Math.abs(b)) ? b : a;
            result = (Math.abs(larger) * (Math.abs(larger)+1) - Math.abs(smaller) * (Math.abs(smaller)-1)) / 2;
            result = larger >= 0 ? result : -result;
        } else {
            larger = a > b ? a : b;
            smaller = a > b ? b : a;
            result = (larger * (larger+1) - Math.abs(smaller) * (Math.abs(smaller)+1)) / 2;
        }

        System.out.println(result);
    }
}