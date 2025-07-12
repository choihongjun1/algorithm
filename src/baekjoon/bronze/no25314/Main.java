package baekjoon.bronze.no25314;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int count = (int) Math.ceil(n / 4.0); // long 개수
        String result = "";

        for(int i = 0; i < count; i++) {
            result += "long ";
        }

        System.out.println(result + "int");
    }
}
