package baekjoon.silver.no16453;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int l = sc.nextInt();
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        for(int i = 0; i < n; i++) {
            if(l >= arr[i]) l++;
            else break;
        }

        System.out.println(l);
    }
}
