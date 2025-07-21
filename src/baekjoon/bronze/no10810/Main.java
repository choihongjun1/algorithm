package baekjoon.bronze.no10810;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < m; i++) {
            int start = sc.nextInt()-1;
            int end = sc.nextInt()-1;
            int number = sc.nextInt();
            for(int j = start; j <= end; j++) {
                arr[j] = number;
            }
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i != arr.length - 1) System.out.print(" ");
        }
    }
}
