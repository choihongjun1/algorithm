package baekjoon.bronze.no15820;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();

        for(int i = 0; i < s1; i++) {
            int correct = sc.nextInt();
            int answer = sc.nextInt();
            if(correct != answer) {
                System.out.println("Wrong Answer");
                return;
            }
        }

        String result = "Accepted";
        for(int i = 0; i < s2; i++) {
            int correct = sc.nextInt();
            int answer = sc.nextInt();
            if(correct != answer) {
                result = "Why Wrong!!!";
            }
        }
        System.out.println(result);
    }
}
