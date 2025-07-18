package baekjoon.bronze.no10801;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] A = new int[10];
        int[] B = new int[10];
        int a = 0;
        int b = 0;

        for(int i = 0; i < 10; i++) {
            A[i] = sc.nextInt();
        }
        for(int i = 0; i < 10; i++) {
            B[i] = sc.nextInt();
        }

        for(int i = 0; i < 10; i++) {
            if(A[i] > B[i]) a++;
            else if(A[i] < B[i]) b++;
        }

        if(a > b) System.out.println("A");
        else if(b > a) System.out.println("B");
        else System.out.println("D");
    }
}
