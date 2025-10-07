package baekjoon.bronze.no11945;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(n * m == 0) return;
        String[] result = new String[n];
        for(int i = 0; i < n; i++) {
            String line = sc.next();
            result[i] = "";
            for(int j = 0; j < m; j++) {
                result[i] = line.charAt(j) + result[i];
            }
        }

        for(int i = 0; i < n; i++) System.out.println(result[i]);
    }
}
