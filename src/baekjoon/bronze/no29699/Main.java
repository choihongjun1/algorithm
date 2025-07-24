package baekjoon.bronze.no29699;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WelcomeToSMUPC".charAt((sc.nextInt() - 1) % 14));
    }
}
