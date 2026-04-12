package baekjoon.bronze.no35479;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double g = sc.nextDouble();
        double b = sc.nextDouble();
        r /= 255.0;
        g /= 255.0;
        b /= 255.0;

        double c = 0.0;
        double m = 0.0;
        double y = 0.0;
        double k = 1 - Math.max(r, Math.max(g, b));
        if(k != 1) {
            c = (1 - r - k) / (1 - k);
            m = (1 - g - k) / (1 - k);
            y = (1 - b - k) / (1 - k);
        }

        System.out.println(c + " " + m + " " + y + " " + k);
    }
}
