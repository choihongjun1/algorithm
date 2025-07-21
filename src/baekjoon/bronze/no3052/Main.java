package baekjoon.bronze.no3052;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < 10; i++) {
            set.add(sc.nextInt() % 42);
        }
        System.out.println(set.size());
    }
}
