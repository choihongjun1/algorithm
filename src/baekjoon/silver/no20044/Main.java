package baekjoon.silver.no20044;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[2*n];
        for(int i = 0; i < 2*n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            int w = arr[i] + arr[arr.length-1-i];
            if(w < min) min = w;
        }
        System.out.println(min);
    }
}
