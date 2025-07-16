package baekjoon.bronze.no2798;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = 0;
        for (int i = 0; i < n-2; i++) {
            for(int j = i+1; j < n-1; j++) {
                for(int k = j+1; k < n; k++) {
                    int sum = arr[i] + arr[j] + arr[k];
                    if(sum <= m && sum > result) {
                        result = sum;
                    }
                }
            }
        }
        System.out.println(result);

    }
}
