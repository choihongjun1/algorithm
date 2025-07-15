package baekjoon.bronze.no10871;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];
        String result = "";

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if(arr[i] < x) {
                result += arr[i] + " ";
            }
        }
        result.trim();
        System.out.println(result);
    }
}
