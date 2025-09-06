package baekjoon.silver.no22353;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int time = a;
        double p = sc.nextInt() / 100.0;
        double k = sc.nextInt() / 100.0;
        double pWin = p;
        double pSum = p;
        double e = time * pWin;

        while(pWin < 1) {
            time += a;
            pWin *= k + 1;
            if(pWin > 1) pWin = 1;
            p = (1-pSum) * pWin;
            pSum += p;
            e += time * p;
        }

        System.out.println(e);
    }
}
