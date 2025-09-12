package baekjoon.silver.no2828;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int apple = sc.nextInt();
        boolean[] basket = new boolean[n];
        for(int i = 0; i < m; i++) {
            basket[i] = true;
        }

        int l = 0;
        int move = 0;
        for(int i = 0; i < apple; i++) {
            int index = sc.nextInt() - 1;

            if(!basket[index] && l > index) {
                move += l - index;

                for(int j = 0; j < n; j++) {
                    if(j >= index && j < index + m) basket[j] = true;
                    else basket[j] = false;
                }

                l = index;
            } else if(!basket[index] && l < index) {
                move += index - l - m + 1;

                for(int j = 0; j < n; j++) {
                    if(j <= index && j > index - m) basket[j] = true;
                    else basket[j] = false;
                }

                l = index - m + 1;
            }
        }

        System.out.println(move);
    }
}
