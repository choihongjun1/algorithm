package baekjoon.bronze.no2747;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        long[] arr = new long[n+1];
        if(n != 0) arr[1] = 1;

        System.out.println(fibo(n, arr));
    }

    public static long fibo(int n, long[] arr) {
        if(n == 0 || n == 1) return n;
        if(arr[n] != 0) return arr[n];
        arr[n] = fibo(n-1, arr) + fibo(n-2, arr);
        return arr[n];
    }
}
