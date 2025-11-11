package baekjoon.silver.no1246;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[m];
        for(int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int revenue = 0;
        int price = 0;
        for(int i = 1; i <= m; i++) {
            if(i > n) break;
            int p = arr[m-i] * i;
            if(p >= revenue) {
                revenue = p;
                price = arr[m-i];
            }
        }
        System.out.println(price + " " + revenue);
    }
}
