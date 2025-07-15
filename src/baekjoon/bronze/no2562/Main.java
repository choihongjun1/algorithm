package baekjoon.bronze.no2562;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[9];
        int max = 0;
        int maxIndex = 0;

        for(int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] > max) {
                max = arr[i];
                maxIndex = i+1;
            }
        }

        System.out.println(max);
        System.out.println(maxIndex);
    }
}
