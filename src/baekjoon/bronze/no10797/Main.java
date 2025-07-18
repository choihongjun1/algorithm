package baekjoon.bronze.no10797;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int count = 0;
        for(int i = 0; i < 5; i++) {
            if(sc.nextInt() == n) count++;
        }
        System.out.println(count);
    }
}
