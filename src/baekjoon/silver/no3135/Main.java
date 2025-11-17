package baekjoon.silver.no3135;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = Math.abs(sc.nextInt() - b);
        }
        Arrays.sort(arr);

        System.out.println(Math.min(Math.abs(a - b), arr[0] + 1));
    }
}
