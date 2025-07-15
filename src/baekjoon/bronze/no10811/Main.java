package baekjoon.bronze.no10811;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i+1;
        }

        for (int i = 0; i < m; i++) {
            int start = sc.nextInt()-1;
            int end = sc.nextInt()-1;
            while(start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        String result = "";
        for(int i : arr) {
            result += i + " ";
        }
        System.out.println(result.trim());
    }
}
