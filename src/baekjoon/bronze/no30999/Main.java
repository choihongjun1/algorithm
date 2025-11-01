package baekjoon.bronze.no30999;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = 0;
        for(int i = 0; i < n; i++) {
            String ox = sc.next();
            if(ox.replace("X", "").length() > m / 2) count++;
        }
        System.out.println(count);
    }
}
