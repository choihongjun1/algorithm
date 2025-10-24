package baekjoon.bronze.no33689;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            if(sc.next().charAt(0) == 'C') count++;
        }
        System.out.println(count);
    }
}
