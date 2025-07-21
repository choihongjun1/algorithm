package baekjoon.bronze.no5597;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean[] student = new boolean[30];

        for(int i = 0; i < student.length-2; i++) {
            student[sc.nextInt()-1] = true;
        }

        for(int i = 0; i < student.length; i++) {
            if(!student[i]) System.out.println(i+1);
        }
    }
}
