package baekjoon.bronze.no10250;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        String[] result = new String[t];
        for(int i = 0; i < t; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            int n = sc.nextInt();
            int count = n / h + 1;
            int floor = n % h;
            if(floor == 0) {
                count -= 1;
                floor = h;
            }

            result[i] = floor + ((count < 10) ? "0" + count : "" + count);
        }

        for(String s : result) System.out.println(s);
    }
}
