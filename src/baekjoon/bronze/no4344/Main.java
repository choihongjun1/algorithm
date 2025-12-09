package baekjoon.bronze.no4344;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        double[] result = new double[t];
        for(int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int sum = 0;
            for(int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
                sum += arr[j];
            }
            double avg = (double)sum / n;

            int count = 0;
            for(int j = 0; j < n; j++) {
                if(arr[j] > avg) count++;
            }
            result[i] = (double)count / n;
        }

        for(double d : result) System.out.printf("%.3f%%\n", d*100);
    }
}
