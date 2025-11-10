package baekjoon.silver.no5545;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int b = sc.nextInt();
        int cal = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int x = cal / p;
        int max = x;
        for(int i = 0; i < n; i++) {
            p += b;
            cal += arr[n-1-i];
            x = cal / p;
            if(x > max) max = x;
        }

        System.out.println(max);
    }
}
