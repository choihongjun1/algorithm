package baekjoon.silver.no23028;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 8 - sc.nextInt();
        int major = 66 - sc.nextInt();
        major = (int)Math.ceil(major / 3.0);
        int total = 130 - sc.nextInt();

        for(int i = 0; i < 10; i++) {
            int subject = 0;
            int m = sc.nextInt();
            int e = sc.nextInt();

            if(i < n) {
                if(major > 0) {
                    int min = Math.min(Math.min(m, 6), major);
                    major -= min;
                    total -= 3 * min;
                    subject += min;
                }

                if(total > 0) {
                    int min = Math.min(6-subject, e);
                    total -= 3 * min;
                }
            }
        }

        if(major <= 0 && total <= 0) {
            System.out.println("Nice");
        } else {
            System.out.println("Nae ga wae");
        }
    }
}
