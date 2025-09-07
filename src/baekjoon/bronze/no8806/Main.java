package baekjoon.bronze.no8806;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String[] result = new String[t];

        for(int i = 0; i < t; i++) {
            double rock1 = sc.nextDouble();
            double paper1 = sc.nextDouble();
            double scissor1 = sc.nextDouble();
            double rock2 = sc.nextDouble();
            double paper2 = sc.nextDouble();
            double scissor2 = sc.nextDouble();

            double p1 = rock1 * scissor2 + paper1 * rock2 + scissor1 * paper2;
            double p2 = rock2 * scissor1 + paper2 * rock1 + scissor2 * paper1;

            if(p1 > p2) result[i] = "GOSIA";
            else if(p1 < p2) result[i] = "ADAM";
            else result[i] = "=";
        }

        for(String s : result) System.out.println(s);
    }
}
