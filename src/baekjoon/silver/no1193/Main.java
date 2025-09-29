package baekjoon.silver.no1193;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int diag = 1;
        while(sigma(diag) < x) {
            diag++;
        }

        int count = x - sigma(diag-1);
        if(diag % 2 == 1) {
            System.out.println((diag + 1 - count) + "/" + count);
        } else {
            System.out.println(count + "/" + (diag + 1 - count));
        }
    }

    public static int sigma(int n) {
        return n * (n + 1) / 2;
    }
}
