package baekjoon.silver.no1051;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        String[] arr = new String[r];
        for(int i = 0; i < r; i++) {
            arr[i] = sc.next();
        }

        int size = Math.min(r, c);
        for(int i = size; i >= 1; i--) {
            if(check(i, r, c, arr)) {
                size = i;
                break;
            }
        }

        System.out.println(size * size);
    }

    public static boolean check(int size, int r, int c, String[] arr) {
        if(size == 1) return true;
        for(int i = 0; i <= r - size; i++) {
            for(int j = 0; j <= c - size; j++) {
                char num1 = arr[i].charAt(j);
                char num2 = arr[i].charAt(j + size - 1);
                char num3 = arr[i + size - 1].charAt(j);
                char num4 = arr[i + size - 1].charAt(j + size - 1);
                if(num1 == num2 && num1 == num3 && num1 == num4) return true;
            }
        }
        return false;
    }
}
