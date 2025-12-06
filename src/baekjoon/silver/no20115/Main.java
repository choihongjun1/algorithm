package baekjoon.silver.no20115;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        double drink = arr[n-1];
        for(int i = 0; i < n-1; i++) {
            drink += arr[i] / 2.0;
        }

        System.out.println(drink);
    }
}
