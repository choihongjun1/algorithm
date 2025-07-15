package baekjoon.bronze.no10951;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        while(sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            list.add(a+b);
        }

        for (int i : list) {
            System.out.println(i);
        }
    }
}
