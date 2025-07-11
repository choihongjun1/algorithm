package alkon.week2.no25494;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt(); // 테스트 수
        int[] count = new int[t]; // 정답 수

        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            for (int x = 1; x <= a; x++) {
                for (int y = 1; y <= b; y++) {
                    for (int z = 1; z <= c; z++) {
                        if (x % y == y % z && x % y == z % x) {
                            count[i]++;
                        }
                    }
                }
            }
        }

        for (int i : count) {
            System.out.println(i);
        }

    }
}
