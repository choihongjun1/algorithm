package baekjoon.gold.no1011;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        long[] result = new long[t];
        for(int i = 0; i < t; i++) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            long d = y - x;

            result[i] = findMin(d);
        }

        for(long c : result) System.out.println(c);
    }

    public static long findMin(long d) {
        long count = 1;
        long sum = 1;
        long num = 1;
        while (sum < d) {
            count++;
            sum += num;
            if(count % 2 == 0) num++;
        }
        return count;
    }
}
