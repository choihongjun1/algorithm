package baekjoon.bronze.no11021;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            list.add(a+b);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Case #" + (i + 1) + ": " + list.get(i));
        }
    }
}
