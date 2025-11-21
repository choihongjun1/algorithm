package baekjoon.silver.no2503;

import java.util.Scanner;

public class Main {
    static String[] num;
    static int[] strike;
    static int[] ball;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        num = new String[n];
        strike = new int[n];
        ball = new int[n];
        for(int i = 0; i < n; i++) {
            num[i] = sc.next();
            strike[i] = sc.nextInt();
            ball[i] = sc.nextInt();
        }

        int count = 0;
        for(int i = 1; i < 10; i++) {
            for(int j = 1; j < 10; j++) {
                for(int k = 1; k < 10; k++) {
                    if(i != j && i != k && j != k) {
                        if(!check(String.valueOf(i) + j + k)) {
                            continue;
                        }
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }

    public static boolean check(String x) {
        for(int i = 0; i < num.length; i++) {
            int s = strike[i];
            int b = ball[i];
            for(int j = 0; j < 3; j++) {
                String sub = x.substring(j , j+1);
                if(num[i].contains(sub)) {
                    if(num[i].substring(j, j+1).equals(sub)) s--;
                    else b--;
                }
            }

            if(s != 0 || b != 0) return false;
        }

        return true;
    }
}
