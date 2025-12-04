package baekjoon.bronze.no14659;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        int maxCount = 0;
        int max = 0;
        for(int i = 0; i < n; i++) {
            int h = sc.nextInt();

            if(h > max) {
                max = h;
                if(count > maxCount) maxCount = count;
                count = 0;
            } else {
                count++;
            }
        }

        if(count > maxCount) maxCount = count;

        System.out.println(maxCount);
    }
}
