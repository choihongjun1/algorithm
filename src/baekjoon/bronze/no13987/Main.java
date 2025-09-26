package baekjoon.bronze.no13987;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] p1 = new int[6];
        int[] p2 = new int[6];
        double p = 0;
        double t = 36;

        for(int i = 0; i < 6; i++) {
            p1[i] = sc.nextInt();
        }
        for(int i = 0; i < 6; i++) {
            p2[i] = sc.nextInt();
        }

        for(int i = 0; i < 6; i++) {
            for(int j = 0; j < 6; j++) {
                if(p1[i] > p2[j]) p++;
                else if(p1[i] == p2[j]) t -= 1;
            }
        }
        p /= t;

        System.out.printf("%.5f", p);
    }
}
