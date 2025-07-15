package baekjoon.bronze.no11022;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        List<Integer> aList = new ArrayList<>();
        List<Integer> bList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            aList.add(a);
            bList.add(b);
        }

        for (int i = 0; i < aList.size(); i++) {
            System.out.println("Case #" + (i + 1) + ": " + aList.get(i) + " + " + bList.get(i) + " = " + (aList.get(i) + bList.get(i)));
        }
    }
}
