package baekjoon.silver.no1057;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int round = (int)Math.ceil(n / 2.0);

        for(int i = 1; i <= round; i++) {
            if(Math.abs(a - b) == 1 && Math.min(a, b) % 2 == 1) {
                System.out.println(i);
                break;
            }

            a = (int)Math.ceil(a / 2.0);
            b = (int)Math.ceil(b / 2.0);
        }
    }
}
