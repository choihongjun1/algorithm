package baekjoon.bronze.no10813;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 1; i <= n; i++) {
            arr[i-1] = i;
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i != arr.length-1) System.out.print(" ");
        }
    }
}
