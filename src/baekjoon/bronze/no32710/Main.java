package baekjoon.bronze.no32710;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        if(check(n)) System.out.println(1);
        else System.out.println(0);
    }

    public static boolean check(int n) {
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= 9; i++) {
            list.add(i);
        }

        if(list.contains(n)) return true; // 한 자리수
        for(int i = 2; i <= 9; i++) {
            if(n % i == 0 && list.contains(n / i)) { // i의 배수이고, 몫이 한 자리수
                return true;
            }
        }
        return false;
    }
}
