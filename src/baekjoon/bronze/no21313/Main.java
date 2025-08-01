package baekjoon.bronze.no21313;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        arr[0] = 1;
        for(int i = 1; i < n; i++) {
            if(i != n-1) arr[i] = arr[i-1] != 1 ? 1 : 2;
            else arr[i] = arr[i-1] != 2 ? 2 : 3;
        }

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if(i != n-1) System.out.print(" ");
        }
    }
}
