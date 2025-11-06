package baekjoon.silver.no2303;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int result = 1;
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            int[] arr = new int[5];
            for(int j = 0; j < 5; j++) {
                arr[j] = sc.nextInt();
            }
            int digit = onesDigit(arr);
            if(digit >= max) {
                max = digit;
                result = i;
            }
        }
        System.out.println(result);
    }

    public static int onesDigit(int[] arr) {
        int max = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                for(int k = j + 1; k < arr.length; k++) {
                    int digit = (arr[i] + arr[j] + arr[k]) % 10;
                    if(digit > max) max = digit;
                }
            }
        }
        return max;
    }
}
