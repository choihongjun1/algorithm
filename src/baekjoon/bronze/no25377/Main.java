package baekjoon.bronze.no25377;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            if(A <= B) result.add(B);
        }
        Collections.sort(result);
        if(result.isEmpty()) System.out.println(-1);
        else System.out.println(result.get(0));
    }
}
