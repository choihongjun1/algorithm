package baekjoon.bronze.no11034;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> result = new ArrayList<>();
        while(sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int max = Math.max(b - a, c - b) - 1;
            result.add(max);
        }

        for(Integer i : result) {
            System.out.println(i);
        }
    }
}
