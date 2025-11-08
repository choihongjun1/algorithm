package baekjoon.silver.no9237;

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

        int day = 0;
        for(int i = 1; i <= arr.length; i++) {
            int t = arr[n-i] + 1 + i;
            if(t > day) day = t;
        }
        System.out.println(day);
    }
}
