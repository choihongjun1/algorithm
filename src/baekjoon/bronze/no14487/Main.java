package baekjoon.bronze.no14487;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int max = 0;
        for(int i = 0; i < n; i++) {
            int c = sc.nextInt();
            sum += c;
            if(c > max) max = c;
        }
        sum -= max;
        System.out.println(sum);
    }
}
