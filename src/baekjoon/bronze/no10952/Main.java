package baekjoon.bronze.no10952;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        while(true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == 0 && b == 0) break;
            else list.add(a+b);
        }

        for (int i : list) {
            System.out.println(i);
        }
    }
}
