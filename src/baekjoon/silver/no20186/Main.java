package baekjoon.silver.no20186;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int score = 0;
        for(int i = 0; i < k; i++) {
            score += arr[arr.length-1-i] - i;
        }

        System.out.println(score);
    }
}
