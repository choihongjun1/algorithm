package baekjoon.silver.no2960;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        List<Integer> num = new ArrayList<>();
        for(int i = 2; i <= n; i++) {
            num.add(i);
        }

        while(!num.isEmpty()) {
            int index = 0;
            int p = num.get(0);
            int curr = p;
            while(curr <= n) {
                if(index != -1) {
                    num.remove(index);
                    k--;
                    if(k == 0) {
                        System.out.println(curr);
                        return;
                    }
                }
                curr += p;
                index = num.indexOf(curr);
            }
        }

    }
}
