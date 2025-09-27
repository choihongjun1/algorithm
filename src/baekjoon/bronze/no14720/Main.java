package baekjoon.bronze.no14720;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int milk = 0;
        for(int i = 0; i < n; i++) {
            int store = sc.nextInt();
            if(milk % 3 == store) milk++;
        }
        System.out.println(milk);
    }
}
