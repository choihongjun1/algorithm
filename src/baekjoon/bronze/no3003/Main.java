package baekjoon.bronze.no3003;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] piece = {1, 1, 2, 2, 2, 8};
        String result = "";

        for(int i = 0; i < piece.length; i++) {
            piece[i] -= sc.nextInt();
            result += piece[i];
            if(i != piece.length - 1) {
                result += " ";
            }
        }

        System.out.println(result);
    }
}
