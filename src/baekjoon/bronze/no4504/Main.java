package baekjoon.bronze.no4504;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        while(true) {
            int num = sc.nextInt();
            if(num == 0) break;
            list.add(num);
        }

        for(int i : list) {
            if(i % n != 0) {
                System.out.println(i + " is NOT a multiple of " + n + ".");
            } else {
                System.out.println(i + " is a multiple of " + n + ".");
            }
        }
    }
}
