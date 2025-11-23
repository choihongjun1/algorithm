package baekjoon.silver.no23561;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n * 3];
        for(int i = 0; i < n * 3; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        System.out.println(arr[n * 2 - 1] - arr[n]);
    }
}
