package baekjoon.bronze.no2693;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] result = new int[t];
        for(int i = 0; i < t; i++) {
            int[] arr = new int[10];
            for(int j = 0; j < 10; j++) {
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            result[i] = arr[7];
        }
        for(int n : result) System.out.println(n);
    }
}
