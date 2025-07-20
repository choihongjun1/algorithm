package baekjoon.bronze.no10798;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        char[][] arr = new char[5][15];
        for (int i = 0; i < 5; i++) {
            String word = sc.next();
            for (int j = 0; j < 15; j++) {
                if(j < word.length()) {
                    arr[i][j] = word.charAt(j);
                } else {
                    arr[i][j] = ' ';
                }
            }
        }

        String result = "";
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if(arr[j][i] != ' ') result += arr[j][i];
            }
        }
        System.out.println(result);
    }
}
