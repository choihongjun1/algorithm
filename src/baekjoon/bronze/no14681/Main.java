package baekjoon.bronze.no14681;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int x = sc.nextInt();
        int y = sc.nextInt();

        if(x > 0) {
            if(y > 0) System.out.println(1);
            else System.out.println(4);
        } else {
            if(y > 0) System.out.println(2);
            else System.out.println(3);
        }
    }
}
