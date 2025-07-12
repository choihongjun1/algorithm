package baekjoon.bronze.no2903;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int count = sc.nextInt();
        int point = 2;

        for(int i = 0; i < count; i++){
            point += point-1;
        }

        System.out.println(point * point);
    }
}
